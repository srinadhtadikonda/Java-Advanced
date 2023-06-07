import java.util.ArrayList;
public class ArrayListExample1
{
public static void main(String args[])
{
ArrayList<String>AT=new ArrayList<String>();
System.out.println(AT);
System.out.println(AT.size());
AT.add("PEN");
AT.add("PENCIL");
AT.add("");
AT.add("BOOK");
AT.add("SCALE");
AT.add("ERASER");
System.out.println(AT);
System.out.println(AT.size());
AT.add("UNCLE");
AT.add("AUNT");
AT.add("SCALE");
System.out.println(AT);
System.out.println(AT.size());
AT.add("APPLE");
AT.add("MANGO");
AT.add("");
AT.add("GRAPES");
System.out.println(AT);
System.out.println(AT.size());
}
}
