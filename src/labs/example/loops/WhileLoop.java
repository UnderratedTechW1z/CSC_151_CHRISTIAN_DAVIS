/*
@author: Christian Davis
@date: 2/2x/2025
@purpose: The WhileLoop.java program for CSC_151
*/

package labs.example.loops;

public class WhileLoop
{
    public static void main(String[] args)
    {
        executeWhileLoop();
    }
    private static void executeWhileLoop()
    {
        int num = 0;
        while (num <=10)
        {
            num++;
        }
        System.out.println("There were " + num + " number of iterations, the loop is now complete!");
    }
}