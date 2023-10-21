// Java Program to Illustrate ArrayList
// Using While Loop
 
// Importing required classes
import java.util.ArrayList ;
 
// Main class
public class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating and initializing the ArrayList
        // Declaring object of integer type
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        // Adding elements to ArrayList
        // using add() method
        al.add(3);
        al.add(1);
        al.add(7);
        al.add(20);
        al.add(5);
 
        // Step 1: Setting and initializing a variable
        // as per syntax of while loop
        // Initially declaring and setting
        int val = 0;
 
        // Step 2: Condition
        // Till our counter variable is lesser than size of
        // ArrayList
        while (al.size() > val) {
 
            // Printing the element which holds above
            // condition true
            System.out.println(al.get(val));
 
            // Step 3: Terminating condition by incrementing
            // our counter in each iteration
            val++ ;
        }
    }
}
