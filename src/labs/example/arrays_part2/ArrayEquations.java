/*
@author: Christian Davis
@date: 03/xx/2025
@purpose: The Array Equations Java Program for the Week 10 Lab
*/

package labs.example.arrays_part2;

public class ArrayEquations
{
    // This program will check if both of the given arrays have the same amount of indexes and 
    public void checkEqualToAndLength()
    {
        // Define arrays for use
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {1, 2, 3, 4, 5};

        // Get the lengths for each of the arrays
        int firstArray_length = firstArray.length;
        int secondArray_length = secondArray.length;

        // Check array lengths to see if they are equal to each other
        if (firstArray_length == secondArray_length)
        {
            System.out.println("Yes, the arrays are the same length.\n");
        }
        else
        {
            System.out.println("No, the arrays are not the same length.\n");
        }

        // Check array values to see if they are all the same
        for (int x = 0; x < firstArray_length; x++)
        {
            if (firstArray[x] == secondArray[x])
            {
                System.out.println("The value " + firstArray[x] + " is in both arrays.");
            }
            else
            {
                System.out.println("The arrays do not contain the same values.");
                break;
            }
        }
    }

    public void sumThreeArrays()
    {
        // The three arrays for use
        int[] arr1 = {42, 17, 63, 89, 54, 23, 71, 8, 35, 56, 4, 91, 62, 30, 15, 78, 51, 12, 70, 66, 27, 99, 38, 49, 83};
        int[] arr2 = {18, 55, 26, 71, 90, 44, 39, 8, 67, 34, 12, 59, 82, 25, 48, 7, 50, 92, 19, 31, 64, 36, 9, 73, 81};
        int[] arr3 = {63, 11, 89, 40, 53, 28, 6, 74, 67, 20, 37, 57, 18, 62, 94, 9, 71, 85, 45, 33, 21, 61, 29, 52, 8};

        // Sum counter for adding the array values
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;

        // Sum up the first array
        for(int z = 0; z < arr1.length; z++)
        {
            sum1 += arr1[z];
        }

        // Sum up the second array
        for(int a = 0; a < arr2.length; a++)
        {
            sum2 += arr2[a];
        }

        // Sum up the third array
        for(int q = 0; q < arr3.length; q++)
        {
            sum3 += arr3[q];
        }

        // Display the sums for each of the arrays
        System.out.println("\nThe sum of the first array is " + sum1);
        System.out.println("The sum of the second array is " + sum2);
        System.out.println("The sum of the third array is " + sum3);

        // Add the sums to an array
        int[] sum_holder = {sum1, sum2, sum3};
        int array_var = 0;

        // Find the highest value sum
        for(int r = 0; r < sum_holder.length; r++)
        {
            for (int p = r + 1; p < sum_holder.length; p++)
            {
                if (sum_holder[r] > sum_holder[p])
                {
                    array_var = sum_holder[r];
                    sum_holder[r] = sum_holder[p];
                    sum_holder[p] = array_var;
                }
            }
        }
        // Print out the final sum from the for loop
        System.out.println("\nThe highest value from the sums is " + array_var);
    }

    public void findMaxValue()
    {
        // The array for use
        int[] myArray = {82, 47, 15, 36, 59, 2, 77, 9, 64, 53, 23, 18, 38, 71, 49, 92, 35, 65, 10, 68, 61, 44, 17, 88, 30, 73, 41, 12, 83, 40, 58, 74, 66, 19, 48, 79, 51, 31, 39, 57, 20, 28, 29, 13, 50, 8, 21, 26, 22, 60};

        // Variable for the max value
        int max_value = myArray[0];

        // Find the max value in the array
        for (int i = 0; i < myArray.length; i++)
        {
            if (myArray[i] > max_value)
            {
                max_value = myArray[i];
            }
        }

        // Print out the max value
        System.out.println("\nThe highest value in the myArray object is: " + max_value);
    }

    public void mod10check()
    {
    int[] card_num = {4, 0, 1, 2, 8, 8, 8, 8, 8, 8, 8, 8, 1, 8, 8, 1};
    int[] card_num_rev = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    int counter = 0;
    int mult = 2;
    int sum_even = 0;
    int odd_card_num = 0;
    // Reverse the card number to go through it
    for (int r = card_num.length; r >= 0; --r)
    {
        card_num_rev[r] = card_num_rev[r] + card_num[r];
    }
    // Go through the reversed number checking the number every two digits
    for (int z = 0; z <= card_num_rev.length; z++)
    {
        counter++;
        // If counter is at a specific point, multiply it by 2
        if (counter > 0 && counter % 2 == 0)
        {
            int g = card_num_rev[z];
            int product = g * mult;
            // If the product of the multiplication is more than 2 digits, subtract 9 from it
            if (product > 9)
            {
                int add_da_nums = product - 9;
                sum_even = sum_even + add_da_nums;
            }
            // If the product doesn't require multiplication, leave the number be
            else
            {
                sum_even = sum_even + product;
            }
        }
        // If the counter isn't at a point that requires multiplication leave it
        else
        {
            int product = card_num_rev[z];
            odd_card_num = odd_card_num + product;
        }
    }
    int sum = sum_even + odd_card_num;
    if (sum % 10 == 0)
    {
        System.out.println("The number " + card_num + " is valid credit card number!");
    }
    else
    {
        System.out.println("The number " + card_num + " is an invalid credit card number.");
    }
}
}
// End of the ArrayEquations.java file