import java.util.*; 
import java.io.*; 
  
class NavigableSetDemo { 
    
    public static void main(String[] args) 
    { 
        NavigableSet<String> ts = new TreeSet<String>(); 
  
        // Elements are added using add() method 
        ts.add("C"); 
        ts.add("D"); 
        ts.add("E"); 
        ts.add("A"); 
        ts.add("B"); 
        ts.add("Z"); 
  
        // Iterating though the NavigableSet 
        for (String value : ts) 
            System.out.print(value + ", "); 
        System.out.println(); 
    } 
}
