
public class Longwordwithallprefix {
    static class Node{
        Node []children=new Node[26];
        boolean endofword=false;
        Node()
        {
            for(int i=0;i<children.length;i++)
            {
                children[i]=null;
            }
        }
    }
    public static void insert(String s)
    {
        Node curr=root;
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                curr.children[idx]=new Node();
            }
            curr=curr.children[idx];
        }
        curr.endofword=true;
    }
    public static String ans="";
    public static void longs(Node curr,StringBuilder d)
    {
        for(int i=0;i<26;i++)
        {
          if(curr.children[i]!=null && curr.children[i].endofword==true)
          {
            char id=(char)(i+'a');
            d.append(id);
            if(d.length()>ans.length())
            {
                ans=d.toString();
            }
            longs(curr.children[i], d);
            d.deleteCharAt(d.length()-1);
          }
        }
    }
    public static Node root=new Node();
    public static void main(String arg[])
    {
    String words[]={"a","banana","app","appl","ap","apply","apple"};
    for(int i=0;i<words.length;i++)
    {
        insert(words[i]);
    }
    longs(root,new StringBuilder(""));
    System.out.println(ans);
}
}
