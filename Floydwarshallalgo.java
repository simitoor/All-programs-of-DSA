public class Floydwarshallalgo
{
    public static void floydWarshall(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==-1)
                {
                    arr[i][j]=(int)(1e9);
                }
                if(i==j)
                arr[i][j]=0;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i][i]<0)
            {
                System.out.println("It has negative cycle");
                return;
            }
        }//for detecting negative cycle;
        for(int k=0;k<arr.length;k++)
        {
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                    arr[i][j]=Math.min(arr[i][j],arr[i][k]+arr[k][j]);
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(arr[i][j]==(int)(1e9))
                {
                    arr[i][j]=-1;
                }
            }
        }
        for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[0].length;j++)
                {
                   System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args) {
      int graph[][] = { { 0, 3,-1, 5 },{2, 0,-1,4 },{ -1, 1, 0,-1 },{-1, -1, 2, 0 } };
       floydWarshall(graph);}
    }
