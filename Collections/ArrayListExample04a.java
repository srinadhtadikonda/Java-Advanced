import java.util.*;
class Main
{
    public static void main(String args[])
    {
        ArrayList<String> AT=new ArrayList<String>();
        AT.add("PEN");
        AT.add("SCALE");
        AT.add("BAT");
        AT.add("Lion");
        System.out.print(AT);
        Collections.sort(AT);
             System.out.print(AT);
Collections.sort(AT, Collections.reverseOrder());
        System.out.print(AT);
    }
}
