public class ratgrain {
    public static void mazes(int maze[][],int i,int j)
    {
        int n=maze.length;
        int sol[][]=new int [n][n];
        if(solvemaze(maze,i,j,sol)==false)
        {
          System.out.print("Solution not exists");
       
        }
        printarr(sol);
    }
    public static void printarr(int sol[][])
    {
        for(int i=0;i<sol.length;i++)
        {
            for(int j=0;j<sol[0].length;j++)
            {
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][],int i,int j)
    {
        return(i>=0 && j>=0 && i<maze.length && j<maze[0].length && maze[i][j]==1);
    }
    public static boolean solvemaze(int maze[][],int row,int col,int sol[][])
    {
        if(row==maze.length-1 && col==maze[0].length-1 && maze[row][col]==1)
        {
            sol[row][col]=1;
            return true;
        }
        if(isSafe(maze,row,col))
        {
            if(sol[row][col]==1)
            return false;
            sol[row][col]=1;
            if(solvemaze(maze,row+1,col,sol))
            return true;
            if(solvemaze(maze, row, col+1,sol))
            return true;
            sol[row][col]=0;
            return false;
        }
        return false;
    }
    public static void main(String ab[])
    {
        int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1} };
        mazes(maze,0,0);
    }
}
