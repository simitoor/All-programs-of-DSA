import java.util.*;
public class reversestringusingstack {
    public static void reversestringusingstacks(String a,Stack <Character> sb,int i)
    {
        if(i==a.length())
        {
            while(!sb.isEmpty())
            {
               System.out.print(sb.pop());
           }
           return;
        }
       char ch=a.charAt(i);
       sb.push(ch);
       reversestringusingstacks(a, sb, i+1);

    }
    public static void main(String arge[])
    {
         Stack <Character> sb=new Stack<>();
         String a="Helloworld";
         reversestringusingstacks(a,sb,0);
    }
}
