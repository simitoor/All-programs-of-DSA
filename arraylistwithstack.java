import java.util.ArrayList;

public class arraylistwithstack {
  static class Stack
    {
      static ArrayList <Integer> sb=new ArrayList<>();
       public  boolean isEmpty()
       {
        return sb.size()==0;
       }
       public  void push(int data)
       {
         sb.add(data);
      }
      public int pop()
      {
        int val=sb.get(sb.size()-1);
        sb.remove(sb.size()-1);
        return val;
      }
      public  int peek()
      {
        return sb.get(sb.size()-1);
      }
    }
      public static void main(String []a)
   { 
     Stack s=new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
  
     while(!s.isEmpty())
     {
        System.out.print(s.pop());
    }
    }
}