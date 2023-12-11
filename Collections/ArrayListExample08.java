import java.util.ArrayList ;
 
public class GFG {
    public static void main(String[] args)
    {
 
       
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(3);
        al.add(1);
        al.add(7);
        al.add(20);
        al.add(5);
 
        int val = 0;

        while (al.size() > val) 
{
            System.out.println(al.get(val));
            val++ ;
        }
    }
}
