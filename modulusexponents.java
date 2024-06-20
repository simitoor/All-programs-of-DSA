public class modulusexponents{
    public static int fastexponent(int num,int b,int p)
    {
      int ans=1;
      if(num%p==0)
      return 0;
        while(b>0)
        {
            if(b%2==1)
            {
                ans=(num*ans)%p;
            }
num=num*num%p;
b=b/2;
        }
         return ans;
    }

    public static void main(String[] arg)
    {
        int num=3;
        int pow=5;
      System.out.print(fastexponent(num,pow,5));
    }
}
