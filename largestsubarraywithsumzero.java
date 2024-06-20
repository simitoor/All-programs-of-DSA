import java.util.HashMap;

public class largestsubarraywithsumzero {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        
        HashMap <Integer,Integer> a= new HashMap<>();
        int sum=0,len=0;
        for(int i=0;i<arr.length;i++)
        {
           sum+=arr[i];
           if(a.containsKey(sum))
           {
              len=Math.max(len,i-a.get(sum));
           }
           else{
            a.put(sum,i);
           }
        }
        System.out.println(len);
    }
}
