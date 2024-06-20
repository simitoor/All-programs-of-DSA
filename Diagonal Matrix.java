import java.util.*;



class exper{
    public static void sum(int arr[][])
    {
      int i=0,j=0,k=arr.length-1,z=arr[0].length-1,sum=0;
      while(i<arr.length && j<arr[0].length && k>=0 && z>=0)
      {
        if(arr[i][j]==arr[k][z] && i==k && j==z)
        {
           sum+=arr[i][j];
        }
        else{
        sum+=arr[i][j]+arr[k][z];
      }
      i++;
      j++;
      k--;
      z--;
    }
    System.out.print(sum);
    }
    public static void main(String[] args) {
    int matrix[][]=new int [3][3];
    int n=matrix.length;
    int m=matrix[0].length;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            matrix[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    sum(matrix);
    sc.close();
}
}
