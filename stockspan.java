import java.util.*;
public class stockspan {
    public static void stocks(int arr[],int span[],Stack <Integer> sb)
    {
        int flag=0;
     for(int i=1;i<arr.length;i++)
     {
         while(arr[i]>=arr[sb.peek()])
         {
            sb.pop();
            if(sb.isEmpty())
            {
              flag=1;
              break;
            }
         }
         if(flag==1)
         {
            span[i]=i+1;
            sb.push(i);
         }
         else{
         span[i]=i-sb.peek();
         sb.push(i);
         }
     }
    }
    public static void main(String aew[])
    {
        int arr[]={100,80,60,70,60,85,100};
        int span[]=new int [7];
        span[0]=1;
        Stack <Integer> sb=new Stack<>();
        sb.push(0);
        stocks(arr, span, sb);
        for(int i=0;i<span.length;i++)
        {
            System.out.print(span[i]);
        }
    }
}
