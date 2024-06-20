import java.util.LinkedList;
import java.util.Queue;

public class Booleanmatrixgraph {
    static class doubling{
        int x;
        int y;
        public doubling(int x,int y)
        {
            this.x=x;
            this.y=y;
        }
    }
    public static int row=4;
    public static int col=5;
    public static boolean isValid(int x,int y){
    return(x>=0 && y>=0 && x<row && y<col);
    }
    public static int max=0;
    public static boolean[][] vis=new boolean[4][5];
    public static int f(Queue<doubling> q,int arr[][])
     {
      
        while(!q.isEmpty())
        {
       doubling curr=q.remove();
       int flag=0;
        if(!vis[curr.x][curr.y])
        {
            vis[curr.x][curr.y]=true;
            
          if(isValid(curr.x+1,curr.y) && arr[curr.x+1][curr.y]==1 && vis[curr.x+1][curr.y]!=true)
          {
            max++;
            vis[curr.x+1][curr.y]=true;
            flag=1;
          }
          if(isValid(curr.x-1,curr.y) && arr[curr.x-1][curr.y]==1 && vis[curr.x-1][curr.y]!=true)
          {
            max++;  
            vis[curr.x-1][curr.y]=true;
            flag=1;
             }
          if(isValid(curr.x,curr.y-1) && arr[curr.x][curr.y-1]==1 && vis[curr.x][curr.y-1]!=true)
          {
            max++;
            vis[curr.x][curr.y-1]=true;  
            flag=1; 
          }
          if(isValid(curr.x-1,curr.y-1) && arr[curr.x-1][curr.y-1]==1 && vis[curr.x-1][curr.y-1]!=true)
          {
            max++;
            vis[curr.x-1][curr.y-1]=true;
            flag=1;    
          }
          if(isValid(curr.x-1,curr.y+1) && arr[curr.x-1][curr.y+1]==1 && vis[curr.x-1][curr.y+1]!=true)
          {
            max++;
            vis[curr.x-1][curr.y+1]=true;
            flag=1;    
          }
          if(isValid(curr.x+1,curr.y-1) && arr[curr.x+1][curr.y-1]==1 && vis[curr.x+1][curr.y-1]!=true)
          {
            max++;
            vis[curr.x+1][curr.y-1]=true;
            flag=1;    
          }
          if(isValid(curr.x+1,curr.y+1) && arr[curr.x+1][curr.y+1]==1 && vis[curr.x+1][curr.y+1]!=true)
          {
            max++;
            vis[curr.x+1][curr.y+1]=true;
            flag=1;    
          }

          if(isValid(curr.x,curr.y+1) && arr[curr.x][curr.y+1]==1 && vis[curr.x][curr.y+1]!=true)
          {
            max++;
            vis[curr.x][curr.y+1]=true;
            flag=1;    
          }
          if(flag==1)
          max++;
        }
    }
        return max;
     }
    public static void main(String[] args) {
        int arr[][]={{0,0,1,1,0},{0,0,1,1,0},{0,0,1,1,0},{0,0,1,1,1}};
        Queue<doubling> q=new LinkedList<>();
        for(int i=0;i<arr.length;i++)
         {
            for(int j=0;j<arr[0].length;j++) 
            {
                if(arr[i][j]==1)
                q.add(new doubling(i,j));
            }
         }
        System.out.print(f(q, arr));
    }
}
