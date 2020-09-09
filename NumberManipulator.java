
/**
 * A class with some number functions.
 *
 * @author 
 * @version
 */

import java.util.Scanner;

public class NumberManipulator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    
        
        // add your code here...

    }

    /**
     * Returns the specified digit (from the left) for the given number.
     *
     * @param num - the number
     * @param nth - the digit desired (from left)
     * @return      the specified digit from the num given.
     */
    public static int getNthDigit(int num, int nth)
    {
        int len = getNumDigits(num);
        int d = len - nth;
        int div = (int) (num / Math.pow(10, d));
        int digit = div % 10;

        return digit;

        // 668846 
        // len = 6
        // d = 6 - 5 = 1
        // div = 668846 / 10^1 = 66884
        // digit = 4
    }

    /**
     *
     */
    // getSumDigits
    {

        // add your code here...

    }

    /**
     *
     */
    // getReversedDigits
    {

        // add your code here...

    }


    /* DO NOT EDIT BELOW THIS LINE */


    /**
     * Returns the number of digits in the given number.
     *
     * @param num the number to be used
     * @return    the number of digits in the specified number
     */
    public static int getNumDigits(int num)
    {
        int n = 1;
        while(num / (int) Math.pow(10, n) > 0)
        {
            n++;
        }

        return n;
    }
}

