import java.util.*;



class exper{
public static void search(int arr[][],int key)
{
    int i=arr.length-1,j=0;
    while(j<arr.length && i>=0)
    {
        if(arr[i][j]==key)
{
    System.out.println(i+","+j);
    return;
}
else if(arr[i][j]>key)
{
    i--;
}
else{
    j++;
}

    }
  System.out.print("Element not there");
  return;
}
    public static void main(String[] args) {
    int matrix[][]=new int [4][4];
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
    search(matrix,30);
    sc.close();
}
}
