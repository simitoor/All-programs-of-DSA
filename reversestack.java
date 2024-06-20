import java.util.Stack;

public class reversestack {
    public static void reverdsing(Stack <Integer> sb)
    {
      if(sb.isEmpty())
      {
        return;
      }
      int d=sb.pop();
      reverdsing(sb);
      pushatbottom(sb,d);
    }
    public static void pushatbottom(Stack <Integer> sb,int d)
    {
        if(sb.isEmpty())
        {
            sb.push(d);
            return;
        }
        int e=sb.pop();
        pushatbottom(sb, d);
         sb.push(e);
    }
    public static void main(String afe[])
    {
      Stack <Integer> sb=new Stack<>();
      sb.push(1);
      sb.push(2);
      sb.push(3);
      reverdsing(sb);
      while(!sb.isEmpty())
      {
         System.out.println(sb.pop());
     }
    }
}
