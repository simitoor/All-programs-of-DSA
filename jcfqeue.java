import java.util.LinkedList;
import java.util.Queue;

public class jcfqeue {
    public static void main(String rqa[])
    {
      Queue <Integer> a=new LinkedList<>();
       a.add(1);
       a.add(2);
       a.add(3);
       while(!a.isEmpty())
       {
        System.out.println(a.remove());
       }
    }
}
