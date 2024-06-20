import java.util.ArrayList;

public class multidimensionallist {
    public static void main(String arrg[])
    {
      ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
      ArrayList<Integer>sb=new ArrayList<>();
      sb.add(1);
      sb.add(2);
      sb.add(3);
      ArrayList<Integer>sb1=new ArrayList<>();
      sb1.add(2);
      sb1.add(4);
      sb1.add(6);
      ArrayList<Integer>sb2=new ArrayList<>();
      sb2.add(3);
      sb2.add(6);
      sb2.add(9);
      mainlist.add(sb);
      mainlist.add(sb1);
      mainlist.add(sb2);
      System.out.println(mainlist);
      //nested loops
      for(int i=0;i<mainlist.size();i++)
      {
        ArrayList<Integer> curr=mainlist.get(i);
        for(int j=0;j<curr.size();j++)
        {
          System.out.print(curr.get(j)+" ");
        }
         System.out.println();
      }
       }
}
