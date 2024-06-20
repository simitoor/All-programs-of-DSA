public class sudokus
{ 
    public static boolean isSafe(int sudoku[][],int digit,int row,int col)
    {
        for(int i=0;i<sudoku.length;i++)
        {
           if(sudoku[i][col]==digit)
           {
            return false;
           }
        }
        for(int j=0;j<sudoku[0].length;j++)
        {
            if(sudoku[row][j]==digit)
            {
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr;i<sr+3;i++)
        {
            for(int j=sc;j<sc+3;j++)
            {
                if(sudoku[i][j]==digit)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokusolver(int sudoku[][],int row,int col)
    {
        if(row==9)
        {
            return true;
        }
        int nextcol=col+1;
        int nextrow=row;
        if(col+1==9)
        {
            nextcol=0;
            nextrow=row+1;
        }
        if(sudoku[row][col]!=0)
        {
           return sudokusolver(sudoku, nextrow,nextcol);
        }
         for(int digit=1;digit<10;digit++)
         {
          if(isSafe(sudoku,digit,row,col))
          {
            sudoku[row][col]=digit;
            if(sudokusolver(sudoku, nextrow, nextcol))
            {
                return true;
            }
            sudoku[row][col]=0;
          }
         
        }
        return false;

    }
    public static void printarr(int arr[][] )
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String []a)
    {
        int sudoku[][]={ {0,0,2,0,0,0,0,8,3},
        {1,0,0,0,0,8,9,2,0},
        {0,0,9,0,4,0,0,0,0},
        {3,0,4,0,0,0,0,0,0},
        {0,7,0,0,2,0,0,5,0},
        {0,0,0,0,0,0,1,0,8},
        {0,0,0,0,1,0,5,0,0},
        {0,5,7,4,0,0,0,0,9},
        {8,9,0,0,0,0,3,0,0} };
         if(sudokusolver(sudoku,0,0))
         {
            System.out.println("Solution exists");
            printarr(sudoku);
         }
         else
         System.out.print("Solution does not exists");

    }
}