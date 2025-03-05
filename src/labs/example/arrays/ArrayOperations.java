/*
@author: Christian Davis
@date: 03/05/2025
@purpose: The ArrayOperations.java program for CSC_151
*/

package labs.example.arrays;

public class ArrayOperations
{
    public void main(String[] args)
    {
        int[] arr = createNewArray(5);
        
        displayArray(arr);
    }

    public static int[] createNewArray(int array_length)
    {
        int[] first_array = new int [array_length];
        for (int x = 0; x < first_array.length; x++)
        {
            first_array[x] = x + 1;
        }
        return first_array;
    }
    private static void displayArray(int[] first_array)
    {
        System.out.println("\nI created a new array and it now has " + first_array.length + " items in it.\n");
        System.out.println("The array items and their values are listed below: ");
        for (int index = 0; index < first_array.length; index++)
        {
            System.out.println(first_array[index]);
        }
    }

    public static int[] sortArray(int[] unsorted_Array)
    {
        int array_var;
        for (int x = 0; x < unsorted_Array.length; x++)
        {
            for (int y = x + 1; y < unsorted_Array.length; y++)
            {
                if (unsorted_Array[x] > unsorted_Array[y])
                {
                    array_var = unsorted_Array[x];
                    unsorted_Array[x] = unsorted_Array[y];
                    unsorted_Array[y] = array_var;
                }
            }
        }
        System.out.println("\nThe Sorted Array:");
        for (int index = 0; index < unsorted_Array.length; index++)
        {
            System.out.println(unsorted_Array[index]);
        }
        return unsorted_Array;
    }

    public static void getDaysAndMonths()
    {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        System.out.println("\nMonths of the Year with Days:\n");
        for (int index = 0; index < months.length; index++)
        {
            System.out.println(months[index] + " has " + days[index] + " days.");
        }
        return;
    }
}