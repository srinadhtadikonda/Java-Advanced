import java.util.*;
class Test07
{
public static void main(String args[])
{
LinkedList<String> LT=new LinkedList<String>();
LT.add("PEN");
LT.add("PENCIL");
LT.add("BOOK");
LT.add("SCALE");
System.out.println(LT);
LT.addFirst("APPLE");
LT.addLast("CHERRY");
System.out.println(LT);
LT.removeFirst();
LT.removeLast();
System.out.println(LT);
}
}

