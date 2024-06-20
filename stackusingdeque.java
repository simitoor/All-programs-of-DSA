import java.util.Deque;
import java.util.LinkedList;
public class stackusingdeque {
    static class stack{
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
       return sb.peekLast();
     } 
     public  int pop()
     {
        return sb.removeLast();
     }
    }
    public static void main(String wq[])
    {
      stack s=new stack();
      s.add(1);
      s.add(2);
      s.add(3);
      s.add(4);
      while(!s.isEmpty())
      {
        System.out.println(s.peek());
        s.pop();
      }
    }
}
