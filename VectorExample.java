//print elements using foreach loop
import java.lang.*;
import java.util.*;
class VectorExample
{
public static void main(String args[])
{
Vector<String> AT=new Vector<String>();
AT.add("CAT");
AT.add("MAT");
AT.add("BASKET");
AT.add("APPLE");
AT.add("RAT");
AT.add("BALL");
for(String x:AT)
{
System.out.print(x+"\t");
}
}
}
