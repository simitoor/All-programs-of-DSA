public class nqueens {
    public static boolean issafe(char a[][],int row,int col)
    {
        
        for(int i=row-1;i>=0;i--)
        {
            if(a[i][col]=='Q')
            {
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--)
        {
            if(a[i][j]=='Q'){
            return false;}
        }
        for(int i=row-1,j=col+1;i>=0 && j<a.length;j++,i--)
        {
            if(a[i][j]=='Q'){
            return false;}
        }
        return true;
    }

    public static void nqueenss(char a[][],int row)
    {
        if(row==a.length)
        {
            print(a);
            count++;
            return;
        }
        for(int j=0;j<a.length;j++)
        {
           if(issafe(a,row,j))
           {
                a[row][j]='Q';
                nqueenss(a, row+1);//function call step
                    a[row][j]='X';//backtracking step for putting X on the queen colum for different answers
           }
        
        }
       
       }
    public static void print(char a[][])
    {
        
        System.out.println("Chess board");
        for(int i=0;i<a.length;i++)
        {
         for(int j=0;j<a[0].length;j++)
         {
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
    }
    static int count=0;
    public static void main(String []arrr)
    {
       
       char board[][]=new char[4][4];
       for(int i=0;i<4;i++)
       {
        for(int j=0;j<4;j++)
        {
         board[i][j]='X';
        }
       }
      nqueenss(board,0);
      
      System.out.print(count);
                }
}
