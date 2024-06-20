public class substringswithsame {
    public static int samelastandfirst(String a,int i,int j,int n)
    {
        if(n==1)
        {
            return 1;
        }
        if(n==0)
        {
            return 0;
        }
        int res=samelastandfirst(a, i+1, j, n-1)+samelastandfirst(a, i, j-1, n-1)-samelastandfirst(a, i+1, j-1, n-2);
        if(a.charAt(i)==a.charAt(j))
        {
            res++;
        }
        return res;
    }
    public static void main(String arr[])
    {
        String a="abcab";
        System.out.print(samelastandfirst(a,0,a.length()-1,a.length()));

    }
}
