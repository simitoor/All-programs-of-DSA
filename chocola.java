import java.util.Arrays;
import java.util.Comparator;

public class chocola {
     public static void main(String[] args) {
       Integer costver[]={4,3,2,1,1};//m-1
       Integer costhor[]={4,2,1};//n-1
       int n=4,m=6;
       Arrays.sort(costhor,Comparator.reverseOrder());
       Arrays.sort(costver,Comparator.reverseOrder());
       int h=0,v=0,hp=1,vp=1,cost=0;
       while(h<costhor.length && v<costver.length)
       {
          if(costhor[h]>=costver[v])
          {
            cost+=costhor[h]*vp;
            hp++;
            h++;
          }
          else{
            
                cost+=costver[v]*hp;
                vp++;
                v++;
            }
        }
        while(h<costhor.length)
        {
            cost+=costhor[h]*vp;
            hp++;
            h++;
        } 
        while(v<costver.length)
        {
            cost+=costver[v]*hp;
            vp++;
            v++; 
        }
        System.out.println(cost);
    }
}
