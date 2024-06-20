import java.util.ArrayList;

public class frequencyfollowingkey {
    public static void search(int target,ArrayList <Integer> sb,int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            if(target==sb.get(i))
            {
                arr[i]++;
            }
        }
    }
    public static void main(String []ww)
    {
     ArrayList <Integer> sb=new ArrayList<>();
     sb.add(2);
     sb.add(2);
     sb.add(2);
     sb.add(2);
     sb.add(3);
     int max=0,j=0;
     int arr[]=new int[sb.size()];
     for(int i=0;i<sb.size();i++)
     {
        if(sb.get(i)==1)
        {
          int target=sb.get(i+1);
          search(target,sb,arr);
        }
     }
     for(int i=0;i<arr.length;i++)
     {
        if(max<arr[i])
        {
            j=i;
        }
     }
     System.out.print(sb.get(j));
    }
}
