import java.util.*;
public class Shortestpath {
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        String directions;
        directions=sc.next();
        int a=0,b=0;
        for(int i=0;i<directions.length();i++)
        {
           if(directions.charAt(i)=='W')
           {
            a--;
           }
           else if(directions.charAt(i)=='N')
           {
            b++;
           }
           else if(directions.charAt(i)=='E')
           {
            a++;
           }
           else{
            b--;
           }
        }
        
       double distance=0;
        distance=Math.sqrt(a*a+b*b);
        System.out.print(distance);
        sc.close();
    }
    
}
