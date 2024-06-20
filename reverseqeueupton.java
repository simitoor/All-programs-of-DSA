import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseqeueupton {
    public static void reversing(Stack <Integer> s,Queue <Integer> q,int k)
    {
      while(!s.isEmpty())
      {
        q.add(s.pop());
      }
      int i=0;
      int a=q.size()-k;
      while(i!=a)
      {
        q.add(q.remove());
        i++;
      }
      System.out.println(q);
    }
    public static void main(String[] args) {
        Queue <Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
  
        int k=5;
        int j=0;
        Stack <Integer> s=new Stack<>();
        while(j!=k)
        {
           s.add(q.remove());
           j++;
        }
        reversing(s,q,k);
    }
}
