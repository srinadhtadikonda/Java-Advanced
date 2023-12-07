//Print ArrayList Elements Using Iterator
import java.util.ArrayList;
public class ArrayListExample7
{
ArrayList<String>AT=new ArrayList<String>();
AT.add("d");
AT.add("dd");
AT.add("ddd");
AT.add("dddd");
AT.add("ddddd");
System.out.println(AT);
Iterator<String>iterator=AT.iterator();
while (iterator.hasNext())
{
String i=iterator.next();
System.out.println(i);
}
}  
