import java.util.Stack;
public class rainwaterusingstack {
    public static void raining(int height[],int rightmax[])
    {
      Stack<Integer> sb=new Stack<>();
      int area=0;
      for(int i=height.length-1;i>=0;i--)
      {
        while(!sb.isEmpty() && height[i]>height[sb.peek()])
        {
           sb.pop();
        }
        if(sb.isEmpty())
        {
            rightmax[i]=height[i];
            sb.push(i);
        }
        else{
            rightmax[i]=height[sb.peek()];
        }
        area+=rightmax[i]-height[i];
      }
      System.out.println(area);
    }
    public static void main(String[] args) {
       int height[]={7,0,4,2,5,0,6,4,0,5};
       int rightmax[]=new int [height.length];
       raining(height,rightmax);
    }
}
