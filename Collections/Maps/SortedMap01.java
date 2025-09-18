import java.util.*;

public class Test21 {
    public static void main(String args[]) {
        SortedMap<Integer, String> hm = new TreeMap<>();
        hm.put(1, "Gyan");
        hm.put(3, "Ankit");
        hm.put(5, "Arun");
        hm.put(4, "Anand");
        hm.put(6, "Ram");

        // Print the whole map
        System.out.println("Map: " + hm);

        // Fetch value with key 4
        String value = hm.get(4);
        System.out.println("Value for key 4: " + value);
    }
}
