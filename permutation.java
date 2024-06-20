public class permutation {
    public static void permutations(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<s.length();i++)
        {
              char ch=s.charAt(i);
              String newstr=s.substring(0,i)+s.substring(i+1);
              permutations(newstr, ans+ch);
        }
    }
    public static void main(String arr[])
    {
           permutations("abc"," ");
    }
}
