import java.util.*;
public class nonrepeatingletters {
    public static void nonrepeatingletter(String a,int i,int arr[],Queue<Character> b)
    {
        if(i==a.length())
        {
            return;
        }
      char d=a.charAt(i);
      int q=d-97;
      b.add(d);
      arr[q]++;
     while(!b.isEmpty())
        {
         if(arr[b.peek()-97]>1)
        {
           b.remove();
            }
            else 
            {
                System.out.print(b.peek());
                break;
             }
          }
        if(b.isEmpty())
        {
            int c=-1;
            System.out.print(c);
        }
      nonrepeatingletter(a, i+1, arr, b);
      } 
      
    
    public static void main(String sre[])
    {
        Queue<Character> s=new ArrayDeque<>();
        String a="aabccxb";
        int ar[]=new int[26];
        nonrepeatingletter(a,0,ar,s);
        
    }
}
