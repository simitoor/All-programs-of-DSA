import java.util.Arrays;
public class Anagram {
    public static void main(String arg[])
    {
        String a="Race";
        String b="cAre";
        a=a.toLowerCase();
        b=b.toLowerCase();
        if(a.length()==b.length())
        {
            char[] atochararray=a.toCharArray();
            char[] btochararray=b.toCharArray();
           Arrays.sort(atochararray);
           Arrays.sort(btochararray);
            if(Arrays.equals(atochararray, btochararray))
            {
                System.out.print("these are anagram");
            }
            else
            {
                System.out.print("these are not anagram");
            }

        }
        else
        {
            System.out.print("these are not anagram");
        }
    }
}