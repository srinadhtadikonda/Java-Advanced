import java.util.*;

public class Test21 {
    public static void main(String args[]) {
        SortedMap<Integer, String> hm = new TreeMap<>();
        hm.put(1, "Gyan");
        hm.put(3, "Ankit");
        hm.put(5, "Arun");
        hm.put(4, "Anand");
        hm.put(6, "Ram");

        // Convert keys to list
        List<Integer> keys = new ArrayList<>(hm.keySet());

        // Sort in reverse order
        Collections.sort(keys, Collections.reverseOrder());

        // Print using for loop
        System.out.println("Descending order without descendingMap():");
        for (Integer key : keys) {
            System.out.println("Key: " + key + ", Value: " + hm.get(key));
        }
    }
}
