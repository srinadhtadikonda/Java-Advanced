//print elements using for loop
import java.lang.*;
import java.util.*;
class Test
{
public static void main(String args[])
{
ArrayList<String> AT=new ArrayList<String>();
AT.add("CAT");
AT.add("MAT");
AT.add("BASKET");
AT.add("APPLE");
AT.add("RAT");
AT.add("BALL");
for (int i = 0; i < AT.size();i++) 
{ 		      
    System.out.println(AT.get(i)); 		
} 
}
}
