public class fastexponents {
    public static void fastexponent(int num,int b)
    {
      int ans=1;
        while(b>0)
        {
            if(b%2==1)
            {
                ans=num*ans;
}
num=num*num;
b=b/2;
        }
       
        System.out.print(ans);
    }

    public static void main(String[] arg)
    {
        int num=3;
        int pow=5;
      fastexponent(num,pow);
    }
}
