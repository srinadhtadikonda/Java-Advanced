import java.lang.*;
import java.util.*;
class StackExample2
{
public static void main(String args[])
{
Stack<String> AT=new Stack<String>();
AT.push("CAT");
AT.push("MAT");
AT.push("BASKET");
AT.push("APPLE");
AT.push("RAT");
AT.push("BALL");
System.out.println(AT);
AT.pop();
System.out.println(AT);
}
}
