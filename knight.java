public class knight {
    public static void kt(int n)
    {
        int sol[][]=new int [n][n];
        for(int i=0;i<sol.length;i++)
        {
            for(int j=0;j<sol[0].length;j++)
            {
               sol[i][j]=-1;
            }
        }
        sol[0][0]=0;
        
        if(knightmoves(sol,0,0,1))
        {
            System.out.print("Solution exists");
            printarr(sol);
        }
        else
        System.out.print("Solution does not exists");
    }
    public static void printarr(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int sol[][],int row,int col)
    {
     return(row>=0 && col>=0 && row<sol.length && col<sol[0].length && sol[row][col]==-1);
    }
    public static boolean knightmoves(int sol[][],int row,int col,int moves )
    {
        int n=sol.length;
        int xmoves[]={2,1,-2,-1,2,1,-2,-1};
        int ymoves[]={1,2,1,2,-1,-2,-1,-2};
        if(moves == n*n)
        {
            return true;
        }
        for(int k=0;k<8;k++)
        {
           int nextxmove=row+xmoves[k];
           int nextymove=col+ymoves[k];
           if(isSafe(sol,nextxmove,nextymove))
           {
            sol[nextxmove][nextymove]=moves;
            if(knightmoves(sol,nextxmove,nextymove,moves+1))
            {
            return true;
            }
            else{
            sol[nextxmove][nextymove]=-1;
            }
            }
        }
        return false;
    }
    public static void main(String ar[])
    {
          kt(8);
           }
}
