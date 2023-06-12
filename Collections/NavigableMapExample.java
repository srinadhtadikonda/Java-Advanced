import java.util.*;

public class NavigableMapExample
 {
        public static void main(String[] args) {
     NavigableMap<Integer,String> Nmap = new TreeMap<Integer,String>();
                Nmap.put(2, "two");
                Nmap.put(1, "one");
                Nmap.put(3, "three");
                System.out.println(Nmap);

        }
}
