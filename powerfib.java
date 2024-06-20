public class powerfib {
    public static int power(int n,int pow)
    {
       if(pow==1)
       {
        return n;
       }
       if(pow%2==0)
       return power(n,pow/2)*power(n,pow/2);
       else
       return n*power(n,pow/2)*power(n,pow/2);
    }//optimised approach
       /*  if(pow==1)
        {
            return n;
        }
          return n*power(n,pow-1);
    }  simple approach */
    public static void main(String args[])
    {

      System.out.print(power(2,5));
    }
}
