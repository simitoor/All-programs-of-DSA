import java.util.Arrays;

public class minabsolutediffpair 
{
     public static void main(String[] args) {
       int a[]={4,1,8,7};
       int b[]={2,3,6,5};
       Arrays.sort(a);
       Arrays.sort(b);
      
       int absolute=0;
     
       for(int i=0;i<a.length;i++)
       {
        if(a[i]>b[i])
        {
            absolute+=a[i]-b[i];
        }
        else{
            absolute+=b[i]-a[i];
        }
       }
       System.out.println(absolute);
    }
}
