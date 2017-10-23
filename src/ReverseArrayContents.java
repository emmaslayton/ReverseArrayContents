/** “ReverseArrayContents."
 *
 *  @author Emma Slayton
 *  Created: 10/4/17
 *  Last updated: 10/6/17
 *
 *  Project 7; CSC201-004N
 *  Assignment 7.12
 *
 */

import java.util.Scanner;

public class ReverseArrayContents {
    public static void main(String[] args) {

        /* Create an array of 10 numbers */
        double[] numbers = new double[10];
        
        /* repeat attempting to get valid input until succesfull */
        boolean InputDone = false;
        
        /* Get the User Input */
        while (InputDone == false) {
            InputDone = getInput(numbers);
        }
        
        /* reverse the contents of the array */
        reverseArray(numbers);

        System.out.print("\n\n Reversing the contents of the array we have: \n");
        
        /* output the array again*/
        printArray(numbers);

        System.out.println("\n\n");

    }


    /* get the input from the user and populate the array */
    public static boolean getInput( double[] nums ) {
        /* Create a Scanner */
        Scanner input = new Scanner(System.in);
        

        /*Prompt User to enter ten Numbers  */
        System.out.print("Please enter ten numbers: ");
       
        /* assume pristine input for now */
        /* read the input */
        for (int i = 0; i < nums.length; i++)  {
            if (input.hasNextDouble()) {
                nums[i] = input.nextDouble();
            }
            else
            {
                System.out.println("Malformed Input Detected\n\n\n");
                return false;
            }
        }
        
        /* show the user what they entered */
        System.out.print("You entered: ");
        printArray (nums);

        return true;
    }


    /* a simple method to output the contents of an array of doubles */
    public static void printArray ( double[] dblArray ) {
        for (int i = 0; i < dblArray.length; i++) {
            System.out.print(dblArray[i] + " ");
        }
        System.out.print("\n");
    }

    /* This method simply reverses the order of the contents of teh array passed to the function */
    public static void reverseArray( double[] dblArray ) {
        double temp = 0.0;
      /* intentionally truncate and round-down the midpoint swap index */
      /* this enables odd sized arrays to also be reversed */
        int MidPointSwapIndex = dblArray.length / 2;

        for (int i = 0, j = dblArray.length -1; i < MidPointSwapIndex; i++, j--) {
            temp = dblArray[i];
            dblArray[i] = dblArray[j];
            dblArray[j] = temp;
        }
    }
}