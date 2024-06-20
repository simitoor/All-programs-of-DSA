public class removingdupli {
    public static void removingduplicates(String s,int i,StringBuilder str,boolean arr[])
    {
        if(i==s.length())
        {
            System.out.print(str);
            return;
        }
        if(arr[s.charAt(i)-'a']==false)
        {
            arr[s.charAt(i)-'a']=true;
            removingduplicates(s,i+1,str.append(s.charAt(i)),arr);
        }
        else{
        removingduplicates(s,i+1,str,arr);
        }
    }
    public static void main(String []arg)
    {
        String s="apnacollege";
       StringBuilder str=new StringBuilder();
      removingduplicates(s,0,str,new boolean[26]);
    }
}
