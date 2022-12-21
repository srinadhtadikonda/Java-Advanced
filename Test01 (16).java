import java.util.*;
public class  Test22
 {
        public static void main(String args[])
 {
   WeakHashMap hm = new WeakHashMap();
                hm.put(1, "Gyan");
                hm.put(3, "Ankit");
                hm.put(5, "Arun");
                hm.put(4, "Anand");
                hm.put(6, "Ram");
System.out.print(hm);
hm.remove(5);
System.out.print(hm);
        }
}
