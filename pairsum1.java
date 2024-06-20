import java.util.ArrayList;

public class pairsum1 {
    public static boolean pairsums(ArrayList <Integer> sb,int target)
    { 
          int rp=sb.size()-1,lp=0;
          while(lp<rp)
          {
            if(sb.get(lp)+sb.get(rp)==target)
            {
                return true;
            }
            else if(sb.get(lp)+sb.get(rp)>target)
            {
               rp--;
            }
            else
            {
                lp++;
            }
          }
          return false;
    }

    public static void main(String abds[])
    {
        ArrayList <Integer> sb=new ArrayList<>();
        for(int i=1;i<=5;i++)
        {
            sb.add(i);
        }
      System.out.print(pairsums(sb,50));
    }
}
