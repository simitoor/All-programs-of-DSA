import java.util.ArrayList;

public class pairsum2 {
    public static boolean pairing(ArrayList<Integer> sb,int lp,int rp,int key)
    {
        while(rp!=lp)
     {
        if(sb.get(lp)+sb.get(rp)==key)
        {
            return true;
        }
        else if(sb.get(lp)+sb.get(rp)>key)
        {
            rp--;
            if(rp==-1)
            {
                rp=sb.size()-1;
            }
        }
        else 
        {
            lp++;
            if(lp==sb.size())
            {
                lp=0;
            }
        }
     }
     return false;
    }
    public static void main(String at[])
    {
      ArrayList <Integer> sb=new ArrayList<>();
      sb.add(11);
      sb.add(15);
      sb.add(6);
      sb.add(8);
      sb.add(9);
      sb.add(10);
     int rp=0,lp=0;
     for(int i=0;i<sb.size();i++)
     {
        if(sb.get(i)>sb.get(i+1))
        {
          rp=i;
          lp=i+1;
           break;
        }
     }
     
      System.out.print(pairing(sb,lp,rp,23));
    }
}
