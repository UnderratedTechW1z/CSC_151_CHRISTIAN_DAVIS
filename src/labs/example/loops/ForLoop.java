/*
@author: Christian Davis
@date: 2/2x/2025
@purpose: The WhileLoop.java program for CSC_151
*/

package labs.example.loops;

public class ForLoop
{
    public static void main(String[] args)
    {
        executeForLoop();
        int result = sumTwoNumbers(1, 10);
        --result;
        System.out.println("The new value would be " + result + "!");
        int second_result = sumLoopCounter(10);
        --second_result;
        System.out.println("The sum of the loop counter is: " + second_result);
    }
    private static void executeForLoop()
    {
        for (int number = 0; number <= 20; number++)
        {
            System.out.println("The value of the counter is " + number + "!");
        }
    }
    private static int sumTwoNumbers(int first, int second)
    {
        int amount = first + second;
        return amount;
    }
    private static int sumLoopCounter(int counter)
    {
        int sum = 0;
        for (int x = 0; x <= counter; x++)
        {
            x += sum;
        }
        return sum;
    }
}