import java.util.*;  
class Test
{  
public static void main(String args[])
{  
  
ArrayList<String> al=new ArrayList<String>();  
al.add("Viru");  
al.add("Saurav");  
al.add("Arun");  
al.add("Tahir");  
Collections.sort(al, Collections.reverseOrder());
System.out.println(al);  
  
}  
}
