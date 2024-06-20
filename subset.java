public class subset {
    public static void subsets(String s,int i,String subsets)
    {
        if(i==s.length())
        {
            System.out.println(subsets);
            return;
        }
        subsets(s,i+1, subsets+s.charAt(i));
        subsets(s,i+1, subsets);
    }
    public static void main(String []a)
    {
        String s="abc";
      subsets(s,0," ");
    }

}
