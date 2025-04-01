/*
@author: Christian Davis
@date: 04/01/2025
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

    public static void main(String[] args) throws IOException
    {
        // Call the openErrorLog() method
        openErrorLog();
        // Call the getErrorTypes method and pass the Buffered reader object into it
        BufferedReader errorlog_reader = new BufferedReader(new FileReader(ERROR_LOG_FILE));
        getCountOfErrorTypes(errorlog_reader);
        // Close the buffered reader file
        errorlog_reader.close();
        // Open the file again for reading
        openErrorLog();
        // Create the Buffered reader object for the file
        BufferedReader errorlog_reader2 = new BufferedReader(new FileReader(ERROR_LOG_FILE));
        // Call the getMemoryLimitExceededCount method and pass the Buffered reader object into it
        getMemoryLimitExceededCount(errorlog_reader2);
        // Close the buffered reader file
        errorlog_reader2.close();
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

    private static void getCountOfErrorTypes(BufferedReader errorlog_reader)
    {
        try
        {
            // Variable for the line of the file
            String line;
            // Get the total amount of errors, warns, info and debugs
            // by using a array list to add each of them.
            ArrayList<String> errorList = new ArrayList<String>();
            ArrayList<String> warnList = new ArrayList<String>();
            ArrayList<String> infoList = new ArrayList<String>();
            ArrayList<String> debugList = new ArrayList<String>();

            while ((line = errorlog_reader.readLine()) != null)
            {
                String[] error_components = line.split(" ");
                if ((error_components[2].equals("[ERROR]")))
                {
                    errorList.add(line);
                }
                if ((error_components[2].equals("[WARN]")))
                {
                    warnList.add(line);
                }
                if ((error_components[2].equals("[INFO]")))
                {
                    infoList.add(line);
                }
                if ((error_components[2].equals("[DEBUG]")))
                {
                    debugList.add(line);
                }
            }
            // Print the total amount of errors, warns, info and debugs
            System.out.println("\nThe total amount of errors is: " + errorList.size());
            System.out.println("\nThe total amount of warns is: " + warnList.size());
            System.out.println("\nThe total amount of info's is: " + infoList.size());
            System.out.println("\nThe total amount of debugs is: " + debugList.size() + "\n");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void getMemoryLimitExceededCount(BufferedReader errorlog_reader2)
    {
        try
        {
            // Variable for the line of the file
            String line_dos;
            // Use array lists to store the memory limit exceeded errors
            // and the endpoint of the error
            ArrayList<String> memory_exceeded = new ArrayList<String>();
            ArrayList<String> endpoint = new ArrayList<String>();

            while ((line_dos = errorlog_reader2.readLine()) != null)
            {
                String[] more_errors = line_dos.split(" ");
                if ((more_errors[5].equals("Memory")))
                {
                    memory_exceeded.add(line_dos);
                    // The first entry should say time instead of times.
                    if (memory_exceeded.size() == 1)
                    {
                        System.out.println("The memory limit has been exceeded " + memory_exceeded.size() + " time");
                    }
                    // The others will end with times.
                    if (memory_exceeded.size() > 1)
                    {
                        System.out.println("The memory limit has been exceeded " + memory_exceeded.size() + " times");
                    }
                    // Add the endpoint to the array list
                    endpoint.add(more_errors[13]);
                    // Print out the endpoint of the error
                    System.out.println("The endpoint is: " + more_errors[13] + "\n");
                }
            }
            // Print the total amount of memory limit exceeded errors
            System.out.println("\nThe total amount of times the memory limit has been exceeded is: " + memory_exceeded.size());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}