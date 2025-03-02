/*
@author: Christian Davis
@date: 03/02/2025
@purpose: The WhileLoop.java program for CSC_151
*/

package labs.example.loops;

public class WhileLoop
{
    public static void main()
    {
        WhileLoop whileloop = new WhileLoop(); 
        whileloop.executeWhileLoop();
    }

    private void executeWhileLoop()
    {
        int num = 0;
        while (num < 10)
        {
            num++;
        }
        System.out.println("\nThere were " + num + " number of iterations, the loop is now complete!\n");
    }
}