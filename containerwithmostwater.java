import java.util.ArrayList;

public class containerwithmostwater {
    public static int twopointer(ArrayList <Integer> sb,int lp,int hp,int max)
    {
        while(lp<hp)
        {
           int width=hp-lp;
           int min=Math.min(sb.get(lp),sb.get(hp));
           int currarr=width*min;
           max=Math.max(max,currarr);
           if(sb.get(hp)>sb.get(lp))
           lp++;
           else
           hp--;
       
        }
        return max;
    }
    public static void main(String ab[])
    {
        ArrayList <Integer> sb=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int width=0,Area=0;
        sb.add(1);
        sb.add(8);
        sb.add(6);
        sb.add(2);
        sb.add(5);
        sb.add(4);
        sb.add(8);
        sb.add(3);
        sb.add(7);
        //brute force
        for(int i=0;i<sb.size()-1;i++)
        {
            for(int j=i+1;j<sb.size();j++)
            {
                min=Math.min(sb.get(i),sb.get(j));
                width=j-i;
                Area=min*width;
                max=Math.max(max,Area);
            }
        }
        
        System.out.print(twopointer(sb,0,sb.size()-1,0));
    }
}
