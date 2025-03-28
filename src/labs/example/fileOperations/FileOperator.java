/*
@author: Christian Davis
@date: 03/28/2025
@purpose: The FileOperator class for the fileOperations package
*/

package labs.example.fileOperations;

import java.io.*;
import java. time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileOperator
{
    // Variables for use in calling the file
    private static final String FILE_PATH = "D:/CSC_151_CHRISTIAN_DAVIS/src/labs/example/fileOperations/";
    private static final String FILE_NAME = "files/users.csv";
    private static final String FULL_FILE_PATH = FILE_PATH + FILE_NAME;
    private static final String ERROR_LOG_FILE = FILE_PATH + "logs/csv_error.log";

    public static void main(String[] args)
    {
        // Call the open() file method
        openCSVFile();
    }

    private static void openCSVFile()
    {
        File csv_file = new File(FULL_FILE_PATH);
         //Gives new File object, and passes in the file name from the defined variable

        // Passes in the FileWriter object and true at the end appends
        try
        {
            BufferedReader csv_file_reader = new BufferedReader(new FileReader(csv_file));
            BufferedWriter log_file = new BufferedWriter(new FileWriter(ERROR_LOG_FILE));
            String line;
            int count = 0;
            int grade = 0;
            int avg = 0;

            if (csv_file.exists()) // Check if the file exists
            {
                while((line = csv_file_reader.readLine()) != null)
                {
                    // Don't need to print the first line, so skip over it with a count variable
                    if (count > 0)
                    {
                        String[] value = line.split(",");
                        //To convert a string to an integer
                        int totalNumGrades = value.length - 1;
                        grade = Integer.parseInt(value[1]) + Integer.parseInt(value[2]) + Integer.parseInt(value[3]);
                        avg = grade/totalNumGrades;
                        System.out.println(value[0] + "'s average is: " + avg);
                    }
                    count++;
                }
            // Close the file
            csv_file_reader.close();
            }
            else
            {
                String message = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                if(!(csv_file.exists()))
                {
                    csv_file.createNewFile();
                    message = message + " MISSING CSV FILE! The " + FILE_NAME + " was missing so it was created.";
                    log_file.write(message);
                    log_file.newLine();
                    log_file.close();
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        }

}
