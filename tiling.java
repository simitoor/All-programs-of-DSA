public class tiling {
    public static int tilingpro(int n)
    {
        if(n==1 || n==0)
        return 1;
        int fnm1=tilingpro(n-1);//vertical
        int fnm2=tilingpro(n-2);//horizontal
        int totways=fnm1+fnm2;
        return totways;
  }
    public static void main(String arr[])
    {
        System.out.print(tilingpro(4));
    }
}
