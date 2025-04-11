/*
@author: Christian Davis
@date: 04/11/2025
@purpose: The Logger class for the fileOperations package
*/

package labs.example.fileOperations;

import java.util.*;
import java.io.*;

public class Logger
{
    //Variables for the file path
    private static final String FILE_PATH = "D:/CSC_151_CHRISTIAN_DAVIS/src/labs/example/fileOperations/";
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/api_error.log";
    private static final String HTTP_ACCESS = FILE_PATH + "logs/http_access.log";

    public static void main(String[] args) throws IOException
    {
        // Call the openErrorLog() method
        openErrorLog();
        // Create a buffered reader object for the error log file
        BufferedReader error_log_read = new BufferedReader(new FileReader(ERROR_LOG_FILE));
        // Call the getDiskSpaceErrorsWithIPAddress() method
        getDiskSpaceErrorsWithIPAddress(error_log_read);
        // Close the buffered reader object
        error_log_read.close();

        // Open the HTTP access log file and create a buffered reader objects for each method
        openErrorLog(HTTP_ACCESS);

        // The GMTOffset method
        BufferedReader http_file = new BufferedReader(new FileReader(HTTP_ACCESS));
        getGMTOffset(http_file);

        // The HTTP codes method
        BufferedReader http_code_file = new BufferedReader(new FileReader(HTTP_ACCESS));
        getHTTPCodes(http_code_file);

        // The response sizes method
        BufferedReader response_size_file = new BufferedReader(new FileReader(HTTP_ACCESS));
        getResponseSizes(response_size_file);

        // The HTTP methods and endpoints method
        BufferedReader http_method_file = new BufferedReader(new FileReader(HTTP_ACCESS));
        groupHTTPMethodsAndEndPoints(http_method_file);

        // Close the buffered reader objects after use
        http_method_file.close();
        response_size_file.close();
        http_code_file.close();
        http_file.close();
    }

    private static BufferedReader openErrorLog() throws IOException
    {
        // New file object
        File error_log = new File(ERROR_LOG_FILE);
        // Buffered reader object for the file
        BufferedReader errorlog_reader = new BufferedReader(new FileReader(error_log));
        // Return the buffered reader object    
        return errorlog_reader;
    }

    // The overloaded openErrorLog() method for the HTTP access log file
    private static BufferedReader openErrorLog(String HTTP_ACCESS) throws IOException
    {
        File http_access = new File(HTTP_ACCESS);
        BufferedReader http_reader = new BufferedReader(new FileReader(http_access));
        return http_reader;
    }

    // The getDiskSpaceErrorsWithIPAddress method
    private static void getDiskSpaceErrorsWithIPAddress(BufferedReader error_log_read)
    {
        // Implement a try and catch statement to catch any errors
        try
        {
            // Variables for use in the while loop
            String errorLine;
            int counter = 0;

            // Array Lists to store the disk space errors and IP addresses
            ArrayList<String> diskSpaceList = new ArrayList<String>();
            ArrayList<String> ipArrayList = new ArrayList<String>();

            // While the next line isn't empty it will go through the code inside
            while ((errorLine = error_log_read.readLine()) != null)
            {
                // The counter variable is used for counting the number of lines in the file
                ++counter;
                // Split the line on spaces
                String[] splitSpaces = errorLine.split(" ");

                // Check if the line contains the word "Disk".
                // If it does add the error to the list and the IP Address to the ipArrayList
                if ((splitSpaces[5].equals("Disk")))
                {
                    diskSpaceList.add(errorLine);
                    ipArrayList.add(splitSpaces[3]);
                    // Print out the error message and the IP Address
                    System.out.println("Disk space error on line " + counter + " for IP Address " + splitSpaces[3]);
                }
            }
            System.out.println("\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void getGMTOffset(BufferedReader http_file)
    {
        // Implement a try and catch statement to catch any errors
        try
        {
            // Variables for use in the while loop
            String gmtOffset;

            // Array Lists to store the GMT offsets and distinct offsets
            ArrayList<String> offset_list = new ArrayList<String>();
            ArrayList<String> distinctOffsets_list = new ArrayList<String>();

            // While the next line isn't empty it will go through the code inside
            while ((gmtOffset = http_file.readLine()) != null)
            {
                // Split the line on spaces
                String[] split_line = gmtOffset.split(" ");
                // Next, split the line on the brackets
                String[] split_line2 = split_line[4].split("]");
                // Add the offset to the list
                offset_list.add(split_line2[0]);
            }
            // Use a for loop to go through the offset list
            for (String offset : offset_list)
            {
                // If the distinct offset list does not contain the current offset,
                // then check if it equals the same one it is currently on.
                // If it is add to the counter variable.
                if (!distinctOffsets_list.contains(offset))
                {
                    int counter = 0;
                    for (String checkOffset : offset_list)
                    {
                        if (offset.equals(checkOffset))
                        {
                            counter++;
                        }
                    }
                    distinctOffsets_list.add(offset);
                    // Print out the distinct offset and the number of times it has occurred
                    // in the file.
                    System.out.println("The GMT offset " + offset + " has occurred " + counter + " times.");
                }
            }
            System.out.println("\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }


    private static void getHTTPCodes(BufferedReader http_code_file)
    {
        // Implement a try and catch statement to catch any errors
        try
        {
            // Variables for use in the while loop
            String line;

            // Array Lists to store the HTTP codes and distinct codes
            ArrayList<String> httpCodeList = new ArrayList<String>();
            ArrayList<String> distinctHttpCodeList = new ArrayList<String>();

            while ((line = http_code_file.readLine()) != null)
            {
                // Split the line on spaces
                // and add the HTTP code to the list
                String[] split_line = line.split(" ");

                httpCodeList.add(split_line[8]);
            }

            for (String httpCode : httpCodeList)
            {
                if (!distinctHttpCodeList.contains(httpCode))
                {
                    int counter = 0;
                    for (String checkHttpCode : httpCodeList)
                    {
                        if (httpCode.equals(checkHttpCode))
                        {
                            counter++;
                        }
                    }
                    distinctHttpCodeList.add(httpCode);
                    System.out.println(httpCode + " Errors: " + counter);
                }
            }
            System.out.println("\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void getResponseSizes(BufferedReader response_size_file)
    {
        // Implement a try and catch statement to catch any errors
        try
        {
            // Variables for use in the while loop
            String line;
            int count = 0;

            // While the line isn't blank, go through the code
            while ((line = response_size_file.readLine()) != null)
            {
                // Split the line on spaces
                String[] split_line = line.split(" ");
                // Create a varibale for the response size and convert it to an integer
                int greaterResponseSize = Integer.parseInt(split_line[9]);
                // If the integer is greater than 3900, add to the count variable
                if (greaterResponseSize > 3900)
                {
                    count++;
                }
            }
            // Print out the total amount of response sizes greater than 3900
            System.out.println("The total amount of response sizes greater than 3900 is: " + count);
            System.out.println("\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void groupHTTPMethodsAndEndPoints(BufferedReader http_method_file)
    {
        try
        {
            // Variables for use in the while loop
            String line;

            // Array Lists to use for the HTTP methods, distinct methods
            // and split distinct methods
            ArrayList<String> httpMethodList = new ArrayList<String>();
            ArrayList<String> distinctMethodList = new ArrayList<String>();

            // While the line isn't blank, go through the code
            while ((line = http_method_file.readLine()) != null)
            {
                // Split the line on spaces
                // and add the HTTP method to the list
                String[] split_line = line.split(" ");
                
                httpMethodList.add(split_line[5]);
            }

            // Check the entries in the httpMethodList
            System.out.println("The HTTP methods in the file are: \n");
            for (String httpMethod : httpMethodList)
            {
                // If the distinct method list does not contain the current method,
                // go through the code.
                if (!distinctMethodList.contains(httpMethod))
                {
                    String method_line = "";
                    // Add the method to the distinctMethodList
                    distinctMethodList.add(httpMethod);
                    // Split the method into individual characters
                    String[] split_method = httpMethod.split("");

                    // For the amount of characters, go through and start at the first index,
                    // removing the double quotes, and adding the other characters to another list.
                    for (int i = 1; i < split_method.length; i++)
                    {
                       method_line += split_method[i];
                    }
                    // Print out the complete method
                    System.out.println(method_line);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}