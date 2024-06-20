public class substringsamelr {
    public static int sun(String a,int d)
    {
        if(d==0)
        {
            return 0;
        }
        int l=0,r=0,sol=0;
        for(int i=0;i<d;i++)
        {
            if(a.charAt(i)=='L')
            {
                l++;
            }
            else if(a.charAt(i)=='R')
            {
                r++;
            }
            if(l==r)
            {
              sol++;
            }
        }
         return sol;
    }
    public static void main(String[] args) {
        String a="LRRRRLLRLLRL";
        int n=a.length();
        System.out.print(sun(a,n));
    }
}
