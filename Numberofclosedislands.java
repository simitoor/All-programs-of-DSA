import java.util.*;
public class Numberofclosedislands {
     static class Pair{
        int x;
        int y;
        public Pair(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
     }
     public static int count=0;
     public static void number(Queue<Pair> q,int arr[][])
     {
        if(q.isEmpty())
        {
            System.out.print(count);
            return;
        }
       Pair curr=q.remove();
        if(arr[curr.x+1][curr.y]==0)
        {
        if(arr[curr.x-1][curr.y]==0)
        {
       if(arr[curr.x][curr.y-1]==0)
        {
         if(arr[curr.x][curr.y+1]==0)
        {
            count++;
        }
         }
         }
         }
       number(q,arr);

     }
    public static void main(String[] args) {
        Queue <Pair> q=new LinkedList<>();
        int mat[][] = {{0, 0, 0, 0, 0, 0, 0, 1},{0, 1, 1, 1, 1, 0, 0, 1},{0, 1, 0, 1, 0, 0, 0, 1},{0, 1, 1, 1, 1, 0, 1, 0},{0, 0, 0, 0, 0, 0, 0, 1}};
        for(int i=0;i<mat.length-1;i++)
        {
            for(int j=0;j<mat[0].length-1;j++)
            {
                if(mat[i][j]==1)
                q.add(new Pair(i, j));
               }
        }
        number(q,mat);
    }
}
