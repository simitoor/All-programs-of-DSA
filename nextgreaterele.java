import java.util.Stack;

public class nextgreaterele {
    public static void next(int arr[],int sol[],Stack<Integer> sb)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
      while(!sb.isEmpty() && arr[sb.peek()]<=arr[i])
      {
        sb.pop();
      }
      if(sb.isEmpty())
      {
        sol[i]=-1;
      }
      else
      {
        sol[i]=arr[sb.peek()];
      }
      sb.push(i);
        }

    }
    public static void main(String andei[])
    {
        int arr[]={6,8,0,1,3};
        int sol[]=new int[5];
        Stack <Integer> sb=new Stack<>();
        next(arr,sol,sb);
        for(int i=0;i<sol.length;i++)
        {
            System.out.print(sol[i]+" ");
        }
    }
}
