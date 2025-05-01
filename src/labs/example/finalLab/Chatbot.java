/*
@author: Christian Davis
@date: 05/01/2025
@purpose: My final lab for CSC_151
*/

package labs.example.finalLab;

import java.net.URI;
import java.net.URISyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Chatbot {

    private static final String apiEndpoint = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent";
    private final String apiKey;

    public Chatbot(String apiKey) {
        this.apiKey = apiKey;
    }
    // Class to handle the Gemini API client
    public String callChatbotAPI(String userInput) throws IOException, URISyntaxException
    {
        try
        {
            // Define the API endpoint and the request method
            String requestMethod = "POST";
            // Construct the full API endpoint with the API key
            String fullUrlString = apiEndpoint + "?key=" + apiKey;

            // Create a URI object
            URL url = new URI(fullUrlString).toURL();
            // Create a connection object
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod(requestMethod);
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            // Create the JSON payload
            String jsonInputString = "{\r\n" +
                                "    \"contents\": [\r\n" +
                                "      {\r\n" +
                                "        \"parts\": [\r\n" +
                                "          {\r\n" +
                                "            \"text\": \"" + userInput + "\"" + "\r\n" +
                                "          }\r\n" +
                                "        ]\r\n" +
                                "      }\r\n" +
                                "    ]\r\n" +
                                "  }";

            // Send the request
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                os.write(input, 0, input.length);
            }

            // Read the response
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String responseLine;
            
            while ((responseLine = br.readLine()) != null) {
                response.append(responseLine);
            }
            String[] finalResponse = response.toString().split("\"");
            String finishedResponse = finalResponse[9];
            return finishedResponse;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Error: Unable to get a response from the chatbot API.";
    }

    public static void main(String[] args) {
        
        // Create a Scanner object to read user input
        String apiKey = "AIzaSyDc70X_gVFoPmAbEeykeyLBFHYsCWSJgCs"; // Replace with your actual API key
        Scanner scanner = new Scanner(System.in);
        Chatbot apiClient = new Chatbot(apiKey);
        // Check if the scanner is not null
        while (scanner != null) {
            System.out.println("Enter 'exit' to quit the program.");
            // Prompt the user for input
            System.out.print("You: ");
            String userInput = scanner.nextLine();
            
            // Check if the user wants to exit
            if (userInput.equalsIgnoreCase("exit")) {
                System.out.println("Exiting the program.");
                scanner.close();
                return; // Exit the program
            }
            try {
                String response = apiClient.callChatbotAPI(userInput);
                // Print the response from the chatbot
                System.out.println("Chatbot response: " + response);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (URISyntaxException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}