// Importing required classes
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
 
// Main class
class GFG {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating an ArrayList
        ArrayList<Integer> al = new ArrayList<Integer>();
 
        // Adding elements to ArrayList
        al.add(34);
        al.add(12);
        al.add(34);
        al.add(23);
        al.add(54);
 
        // Getting an enumeration object
        Enumeration<Integer> e
            = Collections.enumeration(al);
 
        // Till elements are there
        while (e.hasMoreElements())
 
            // Print elements using nextElement() method
            System.out.println(e.nextElement());
    }
}