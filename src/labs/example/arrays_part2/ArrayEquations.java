/*
@author: Christian Davis
@date: 03/xx/2025
@purpose: The Check Values and Length Java Program for the Week 10 Lab
*/

package labs.example.arrays_part2;

public class ArrayEquations
{
    public static void checkEqualToAndLength()
    {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 2, 3, 4, 5};

        int firstArray_length = firstArray.length;
        int secondArray_length = secondArray.length;
        int firstArray_Sum = 0;
        int secondArray_Sum = 0;

        for (int x = 0; x < firstArray_length; x++)
        {
           firstArray_Sum += firstArray[x];
        }
        System.out.println("The sum for the first array is " + firstArray_Sum + "!");

        for (int y = 0; y < secondArray_length; y++)
        {
           secondArray_Sum += secondArray[y];
        }
        System.out.println("The sum for the first array is " + secondArray_Sum + "!");

        if (firstArray_Sum == secondArray_Sum)
        {
            System.out.println("Yes, the arrays do contain the same values.");
        }
        else
        {
            System.out.println("No, the arrays do not contain the same values.");
        }
        
        if (firstArray_length == secondArray_length)
        {
            System.out.println("Yes, the arrays are the same length.");
        }
        else
        {
            System.out.println("No, the arrays are not the same length.");
        }
    }
}