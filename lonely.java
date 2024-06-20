import java.util.ArrayList;
import java.util.Collections;
public class lonely {
    public static void lonelys(ArrayList <Integer> sb,ArrayList <Integer> ab)
    {
        Collections.sort(sb);
        if(sb.size()==1)
            {
                ab.add(sb.get(0));
            }
        for(int i=1;i<sb.size()-1;i++)
        {
            if(sb.get(i-1)+1<sb.get(i) && sb.get(i)+1<sb.get(i+1))
            {
                ab.add(sb.get(i));
            }
        }
            
            if(sb.size()>1)
            {
                if(sb.get(0)+1<sb.get(1))
                {
                    ab.add(sb.get(0));
                }
                if(sb.get(sb.size()-2)+1<sb.get(sb.size()-1))
                {
                    ab.add(sb.get(sb.size()-1));
                }
            }
        return;
    }
    public static void main(String []av)
    {
        ArrayList <Integer> sb=new ArrayList<>();
        sb.add(10);
        sb.add(6);
        sb.add(5);
        sb.add(8);
        
        ArrayList <Integer> ab=new ArrayList<>();
        lonelys(sb,ab);
        for(int i=0;i<ab.size();i++)
        {
            System.out.print(ab.get(i)+" ");
            
        }
    }
}
