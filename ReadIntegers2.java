package Projects.Week5;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.ArrayList;
/**
 * This program asks the user to input integers, stores the integers in a Stack, and sorts the
 * stack from smallest to largest. This program also utilizes the Java collections framework, including
 * util.Collections, util.Stack, and util.ArrayList
 * @author Greg Ryan
 * CSC6301
 * @since Week 5 of CSC6301
 */
public class ReadIntegers2 {
    /**
     * Main method that initializes a new Stack 'nums',
     * asks the user to input integers, stores the given input in the Stack,
     * prints the original Stack, sorts the Stack,
     * and then prints the new sorted Stack.
     * @param args - default parameter for main, not used
     * @since week 4 of CSC6301
     */
    public static void main(String[] args) {
        /*
        initialize the Stack to hold the list of integers

        CODE REUSE
        Here the Stack class from the Java Collections framework is utilized rather than
        writing a whole new Stack class.
         */
        Stack<Integer> nums = new Stack<>();

        // get the scanned input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a list of integers separated by spaces");
        System.out.println("Enter 'Q' at the end when done entering integers.");

        /*
          This while loop will run until a non-integer is detected, gathering all
          integer values and adding them to the Stack.
          White space and enter/return will also not end the loop, thus why the user
          is asked to input 'Q' when they are done. Really any non-integer value will work,
          it's just simpler to give the user instructions.
         */
        while (sc.hasNextInt())
        {
            nums.push(sc.nextInt());
        }

        // print the initial list of integers provided for clarity
        System.out.println("Here is the initial list: ");
        System.out.println(nums);
        System.out.println();

        /*
          Convert the stack to an ArrayList to then sort it and help maintain LIFO behavior

          CODE REUSE
          Here the ArrayList class from the Java Collections framework is utilized rather than
          writing a whole new ArrayList class.
         */
        ArrayList<Integer> numsList = new ArrayList<>(nums);

        /*
          Sort the ArrayList

          CODE REUSE
          Here, the Collections.sort() method is utilized from the java collections framework
          rather than writing a whole new sort method.
         */
        Collections.sort(numsList);

        /*
          Create a new empty stack in which to add the now sorted elements of the ArrayList.
          The stack will now be sorted from smallest to largest while maintaining its
          LIFO behavior, the largest element will be the last added and the first removed.
          Print the now sorted Stack.

          CODE REUSE
          Here we utilize the addAll() method from the Stack class rather than writing a loop
          to add all the values.
         */
        Stack<Integer> sortedNums = new Stack<>();
        sortedNums.addAll(numsList);
        System.out.println("Here is the sorted list: ");
        System.out.println(sortedNums);

        sc.close();
    }
}
