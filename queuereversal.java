import java.util.LinkedList;
import java.util.Queue;


public class queuereversal {
    public static void reversal(Queue <Integer> s)
    {
     if(s.isEmpty())
     {
        return;
     }
    int j=s.remove();
    reversal(s);
    s.add(j);
    }
    public static void main(String aeq[])
    {
      Queue <Integer> s=new LinkedList<>();
      s.add(1);
      s.add(2);
      s.add(3);
      s.add(4);
      s.add(5);
      reversal(s);
      while(!s.isEmpty())
      {
        System.out.println(s.remove());
      }
    }
}
