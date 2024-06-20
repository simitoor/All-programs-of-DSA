import java.util.*;
public class stackusingtwoqueue {
     static class stack{
        static Queue <Integer> s=new ArrayDeque<>();
        static Queue <Integer> s1=new ArrayDeque<>();
        public static int front=-1;
        static int rear=-1;
        public  boolean isEmpty()
        {
            return s.isEmpty();
        }
        public  void add(int data)
        {
            if(front==-1 && rear==-1)
            {
                front=0;
                rear=0;
            }
            else{
            rear++;
            }
            if(s.isEmpty())
            {
              s.add(data);
              return;
            }
           
            while(!s.isEmpty())
            {
                s1.add(s.remove());
                front++;
              }
            s.add(data);
            while(!s1.isEmpty())
            {
                s.add(s1.remove());
            }
        }
       
        public int pop()
        {
            if(s.isEmpty())
            {
                System.out.print("It is empty");
                return -1;
            }
            int ar=s.remove();
               return ar;
            
        }
     }
     public static void main(String awe[])
    {
       stack a=new stack();
       a.add(1);
       a.add(2);
       a.add(3);
       a.add(56);
       while(!a.isEmpty())
       {
        System.out.println(a.pop());
       }
        }
}
