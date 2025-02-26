/*
@author: Christian Davis
@date: 2/26/2025
@purpose: The Main.java program for my loops package
*/

package labs.example.loops;

public class Main
{
    public static void main(String[] args)
    {
        WhileLoop whileloop = new WhileLoop(); 
        executeWhileLoop();

        ForLoop forloop = new ForLoop();
        callExecuteForLoop();
        callSumTwoNumbers();
        callSumLoopCounter();
        callPrintMultiplicationTable();

    }
}
