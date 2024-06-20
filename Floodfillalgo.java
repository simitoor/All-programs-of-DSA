import java.util.*;
public class Floodfillalgo 
{
    static class Ele{
        int x;
        int y;
        public Ele(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public static boolean isValid(int x,int y,int arr[][])
    {
       return (x>=0 && y>=0 && x<arr.length && y<arr[0].length);
    } 
    public static void main(String[] args) 
    {
        int arr[][]={{1,1,1},{1,1,0},{1,0,1}};
       int vis[][]=new int[arr.length][arr[0].length];
        int sr=1,sc=1,color=2;
        if(arr[sr][sc]==1){
        arr[sr][sc]=color;
        vis[sr][sc]=1;
      Queue<Ele> q=new LinkedList<>();
      q.add(new Ele(sr, sc));
      while(!q.isEmpty())
      {
          Ele e=q.peek();
          if(isValid(e.x+1,e.y,arr) && arr[e.x+1][e.y]==1 && vis[e.x+1][e.y]==0)
          {
           arr[e.x+1][e.y]=color;
           q.add(new Ele(e.x+1,e.y));
           vis[e.x+1][e.y]=1;
          }
          if(isValid(e.x-1,e.y,arr) && arr[e.x-1][e.y]==1 && vis[e.x-1][e.y]==0)
          {
           arr[e.x-1][e.y]=color;
           q.add(new Ele(e.x-1,e.y));
           vis[e.x-1][e.y]=1;
          }
          if(isValid(e.x,e.y-1,arr) && arr[e.x][e.y-1]==1 && vis[e.x][e.y-1]==0)
          {
           arr[e.x][e.y-1]=color;
           q.add(new Ele(e.x,e.y-1));
           vis[e.x][e.y-1]=1;
          }
          if(isValid(e.x,e.y+1,arr) && arr[e.x][e.y+1]==1 && vis[e.x][e.y+1]==0)
          {
           arr[e.x][e.y+1]=color;
           q.add(new Ele(e.x, e.y+1));
           vis[e.x][e.y+1]=1;
          }
          q.remove();
        }
    }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
