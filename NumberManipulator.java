
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
     *
     */
    // getNthDigit
    {

        // add your code here...

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

