import java.util.*;

public class Test21 {
    public static void main(String args[]) {
        SortedMap<Integer, String> hm = new TreeMap<>();
        hm.put(1, "Gyan");
        hm.put(3, "Ankit");
        hm.put(5, "Arun");
        hm.put(4, "Anand");
        hm.put(6, "Ram");

        // Print in descending order using descendingMap()
        System.out.println("Descending order:");
        NavigableMap<Integer, String> descMap = ((TreeMap<Integer, String>) hm).descendingMap();

        for (Map.Entry<Integer, String> entry : descMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
