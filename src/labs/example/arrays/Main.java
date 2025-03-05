/*
@author: Christian Davis
@date: 03/05/2025
@purpose: The Main.java program for my arrays package in CSC_151
*/

package labs.example.arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayOperations arrayoperations = new ArrayOperations();
        arrayoperations.main(args);

        int[] unsorted_Array = {23, 7, 11, 16, 3, 39, 28, 5, 31, 45, 18, 41, 1, 33, 17, 22, 40, 9, 15, 13, 48, 25, 43, 37, 42, 10, 12, 27, 14, 38, 20, 46, 4, 50, 6, 30, 36, 32, 34, 49, 2, 35, 29, 44, 21, 8, 19, 47, 26, 24};
        ArrayOperations.sortArray(unsorted_Array);
        ArrayOperations.getDaysAndMonths();
    }
}