
import java.util.*;

public class Test23
 {
        public static void main(String args[]) 
{
                IdentityHashMap map = new IdentityHashMap();

                // Add the mapping into the map
                map.put(1, "A");
                map.put(2, "A");
                map.put(3, "B");
                map.put(5, "G");
                map.put(4, "N");
                System.out.println(" The Map elements are : " + map);

        }
}
