import java.util.*;
public class interleavetwohalves {
    public static void halves(Queue <Integer> s,int i)
    {
        int j=0;
     Queue <Integer> s1=new LinkedList<>();
        while(j!=i)
        {
            s1.add(s.remove());
            j++;
        }
      
        while(!s1.isEmpty())
        {
           s.add(s1.remove());
           s.add(s.remove());
        }
        while(!s.isEmpty())
        {
            System.out.print(s.remove()+" ");
        }
    }
    public static void main(String are[])
    {
        Queue<Integer> s=new LinkedList<>();
         s.add(1);
         s.add(2);
         s.add(3);
         s.add(4);
         s.add(5);
         s.add(6);
         s.add(7);
         s.add(8);
         s.add(9);
         s.add(10);
       int r=(s.size())/2;
        halves(s,r);
    }
}
