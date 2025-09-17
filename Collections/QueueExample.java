import java.util.*;
class Main
 {
public static void main(String[] args) 
{
Queue<String>queue = new LinkedList<String>();
queue.add("Java");
queue.add(".NET");
queue.add("Javascript");
queue.add("HTML5");
System.out.println(queue);
System.out.println(queue.size());
queue.remove();
System.out.println(queue);
System.out.println(queue.size());
String x=queue.peek();
System.out.println(x);
System.out.println(queue.size());
}
}
