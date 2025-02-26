/*
@author: Christian Davis
@date: 2/2x/2025
@purpose: The ForLoop.java program for CSC_151
*/

package labs.example.loops;

public class ForLoop
{
    public static void main(String[] args)
    {
        executeForLoop();
        System.out.println("\n");

        int result = sumTwoNumbers(2, 10);
        System.out.println("The new value would be " + result + "!");
        System.out.println("\n");

        int second_result = sumLoopCounter(10);
        System.out.println("The sum of the loop counter is " + second_result + "!");
        System.out.println("\n");

        int third_result = printMultiplicationTable(10);
    }

    private static void executeForLoop()
    {
        for (int number = 0; number <= 20; number++)
        {
            System.out.println("The value of the counter is " + number + "!");
        }
    }

    public static void callExecuteForLoop()
    {
        executeForLoop();
    }

    private static int sumTwoNumbers(int first, int second)
    {
        int amount = first + second;
        return amount;
    }

    public static int callSumTwoNumbers()
    {
        sumTwoNumbers(2, 10);
    }

    private static int sumLoopCounter(int counter)
    {
        int sum = 0;
        for (int x = 0; x < counter; x++)
        {
            ++sum;
        }
        return sum;
    }

    public static int callSumLoopCounter()
    {
        sumLoopCounter(10);
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

    public static int callPrintMultiplicationTable()
    {
        printMultiplicationTable(10);
    }
}