import java.util.ArrayList;
import java.util.Arrays;
public class indiancoins {
     public static void main(String[] args)
      {
       int arr[]={1,2,5,10,20,50,100,500,2000};
       int value=617;
       int ans=0;
       ArrayList<Integer> q=new ArrayList<>();
       Arrays.sort(arr);
       for(int i=arr.length-1;i>=0;i--)
       {
        while(arr[i]<=value)
        {
            value-=arr[i];
            q.add(arr[i]);
            ans++;
        }
        if(value==0)
        {
            System.out.println(ans);
            break;
        }
        
       }
       System.out.println(q);
      }
}
