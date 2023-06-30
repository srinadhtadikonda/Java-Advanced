
// Java program to iterate over an arraylist
// using Iterator in Java8 with Lambda Expression
 
// Importing all utility classes
import java.util.*;
 
// Main class
class GFG {
   
    // Main driver method
    public static void main(String[] args)
    {
        // Declaring and initializing ArrayList
        // Custom input elements
        List<Integer> numbers = Arrays.asList(1, 2, 3,
                                       4, 5, 6, 7, 8);
 
        // Printing numbers using lambda expressions
        // been introduced later in java8
        numbers.forEach(number->System.out.println(number));
 
    }
}