public class friendspairing {
    public static int friends(int n)
    {
        if(n==1 || n==2)
        {
            return n;
        }
        int single=friends(n-1);
        int double1=(n-1)*friends(n-2);
        int totways=single+double1;
        return totways;
    }
    public static void main(String []arr)
    {
      System.out.print(friends(5));
    }
}
