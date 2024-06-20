public class fibanoccinumber {
    public static int fibanocci(int n)
    {
        int number=0;
          if(n==0)
          {
            return 0;
          }
          if(n==1)
          {
            return 1;
          }
         number=fibanocci(n-1)+fibanocci(n-2);
        return number;
    }
    public static void main(String arr[])
    {
        System.out.print(fibanocci(5));
    }
}
