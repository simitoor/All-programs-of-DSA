import java.util.ArrayList;

public class Cisco_Q3 {
    public static void main(String[] args) {

        int requests[][]={{1,8},{4,9},{6,7}};
        int rate=2;
        int maxpackets=10;
        int a=0;
       int packets=0;
        packets=requests[a][1];
        a++;
        int i=1,dropped=0;
        while(packets!=0)
        {
            i++;
         
          if(packets>maxpackets)
          {
            dropped+=packets-maxpackets;
            packets=maxpackets;
             
          }
           
          if(a<requests.length && requests[a][0]==i  )
          {
            packets+=requests[a][1];
            a++;
          }
          packets-=rate;
         }
        System.out.println(dropped);
    }
}
