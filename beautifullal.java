import java.util.ArrayList;
public class beautifullal {
    public static void al(int start,int increment,ArrayList <Integer> sb,int n)
    {
     if(start+increment>n)
    {
       sb.add(start);
       return;
     }
     al(start,2*increment,sb,n);
     al(start+increment,2*increment,sb,n);

    }

    public static void main(String arr[])
{
    int n=5;
    ArrayList <Integer> sb=new ArrayList<>();
    al(1,1,sb,n);
    System.out.print(sb);
}
}
