import java.util.*;
public class Rottenorganes {
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
     public static boolean isdelim(Ele temp)
     {
        return (temp.x==-1 && temp.y==-1);
     }
     public static boolean sol(int arr[][])
     {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                return false;
            }
        }
        return true;
     }
     public static int as(int arr[][])
     {
        int ans=0;
      Queue<Ele> q=new LinkedList<>();
      for(int i=0;i<arr.length;i++)
      {
        for(int j=0;j<arr[0].length;j++)
        {
            if(arr[i][j]==2)
            q.add(new Ele(i, j));
        }
      }
      q.add(new Ele(-1,-1));
      while(!q.isEmpty())
      {
        boolean t=false;
        while(!isdelim(q.peek()))
        {
          Ele e=q.peek();
          if(isValid(e.x+1,e.y,arr) && arr[e.x+1][e.y]==1)
          {
           if(t==false)
           {
            t=true;
            ans++;
           }
           arr[e.x+1][e.y]=2;
           q.add(new Ele(e.x+1,e.y));
          }
          if(isValid(e.x-1,e.y,arr) && arr[e.x-1][e.y]==1)
          {
           if(t==false)
           {
            t=true;
            ans++;
           }
           arr[e.x-1][e.y]=2;
           q.add(new Ele(e.x-1,e.y));
          }
          if(isValid(e.x,e.y-1,arr) && arr[e.x][e.y-1]==1)
          {
           if(t==false)
           {
            t=true;
            ans++;
           }
           arr[e.x][e.y-1]=2;
           q.add(new Ele(e.x,e.y-1));
          }
          if(isValid(e.x,e.y+1,arr) && arr[e.x][e.y+1]==1)
          {
           if(t==false)
           {
            t=true;
            ans++;
           }
           arr[e.x][e.y+1]=2;
           q.add(new Ele(e.x, e.y+1));
          }
          q.remove();
        }
        q.remove();
        if(!q.isEmpty())
        {
          q.add(new Ele(-1, -1));
        }
      }
      return sol(arr)?ans:-1;
     }
    public static void main(String[] args) 
    {
        int arr[][]={ {2, 1, 1, 2, 1},{1, 1, 1, 2, 1},{2, 1, 1, 2, 1}};
        int j=as(arr);
        if(j==-1)
        {
            System.out.println("It is not possible");
        }
        else {
            System.out.println(j);
        }
    }
}
