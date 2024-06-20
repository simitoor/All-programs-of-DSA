import java.util.Deque;
import java.util.LinkedList;
public class queueusingdeque {
    static class queue{
        Deque <Integer> sb=new LinkedList<>();
     public  boolean isEmpty()
     {
        return sb.isEmpty();
     }
     public void add(int data)
     {
      sb.addLast(data);
     } 
     public  int peek()
     {
       return sb.getFirst();
     } 
     public  int remove()
     {
        return sb.removeFirst();
     }
    }
    public static void main(String wq[])
    {
      queue s=new queue();
      s.add(1);
      s.add(2);
      s.add(3);
      s.add(4);
      while(!s.isEmpty())
      {
        System.out.println(s.peek());
        s.remove();
      }
    }
}

