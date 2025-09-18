import java.util.*;

public class Test21 {
    public static void main(String args[]) {
        SortedMap<Integer, String> hm = new TreeMap<>();
        hm.put(1, "Gyan");
        hm.put(3, "Ankit");
        hm.put(5, "Arun");
        hm.put(4, "Anand");
        hm.put(6, "Ram");

        // Using entrySet() - best way
        System.out.println("Using entrySet():");
        for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Using keySet()
        System.out.println("\nUsing keySet():");
        for (Integer key : hm.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
    }
}
