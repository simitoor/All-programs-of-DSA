import java.util.LinkedList;
import java.util.Queue;
public class generatebinary {
    public static void generating(int n,Queue <String> sb)
    {
          sb.add("1");
          
     while(n-->0)
     {
     String s1=sb.peek();
     System.out.println(s1);
     sb.remove();
     String s2=s1;
     sb.add(s1+"0");
     sb.add(s2+"1");
    }
    }
    public static void main(String[] args) {
        int n=5;
        Queue <String> sb=new LinkedList<String>();
       generating(n,sb);
    }
}
