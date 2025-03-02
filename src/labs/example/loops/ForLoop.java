/*
@author: Christian Davis
@date: 2/2x/2025
@purpose: The ForLoop.java program for CSC_151
*/

package labs.example.loops;

public class ForLoop
{
    public static void main()
    {
        executeForLoop();
        sumTwoNumbers(10, 10);
        sumLoopCounter(10);
        printMultiplicationTable(10);
    }

    private static void executeForLoop()
    {
        for (int number = 0; number <= 20; number++)
        {
            System.out.println("The value of the counter is " + number + "!");
        }
        System.out.println("The loop is now complete!\n");
    }

    private static int sumTwoNumbers(int first, int second)
    {
        int amount = first + second;
        --amount;
        System.out.println("The sum of the two numbers minus one is " + amount + "!\n");
        return amount;
    }

    private static int sumLoopCounter(int counter)
    {
        int sum = 0;
        for (int x = 0; x <= counter; x++)
        {
            sum = sum + x;
        }
        System.out.println("The sum of the loop counter is: " + sum + "!\n");
        return sum;
    }

    private static int printMultiplicationTable(int da_value)
    {
        for (int multi = 0; multi <= 12; multi++)
        {
            int multi_ans = da_value * multi;
            System.out.println(da_value + " * " + multi + " = " + multi_ans + "!");
        }
        return da_value;
    }
}