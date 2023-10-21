// Java  program to iterate over an ArrayList
// Using for loop
 
// Importing all utility classes
import java.util.*;
 
// Main class
class GFG {
   
    // Main driver method 
    public static void main(String[] args)
    {
        // Creating and initializing the ArrayList
        // Declaring object of integer type
        List<Integer> numbers = Arrays.asList(1, 2, 3,
                                       4, 5, 6, 7, 8);
 
        // Iterating using for loop
        for (int i = 0; i < numbers.size(); i++)
           
            // Printing and display the elements in ArrayList
            System.out.print(numbers.get(i) + " ");       
    }
}
