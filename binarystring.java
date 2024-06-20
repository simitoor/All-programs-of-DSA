

public class binarystring {
    public static void binarystrings(int n,int lastplace,String s)
    {
        if(n==0)
        {
            System.out.println(s);
           return;
        }
        binarystrings(n-1,0,s+"0");
        if(lastplace==0)
        {
            binarystrings(n-1,1, s+"1");
        }
        
    }
    public static void main(String []srg)
    {
       binarystrings(3,0,"");
    }
}
