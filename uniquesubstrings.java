import java.util.*;
public class uniquesubstrings {
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
    public static void unique()
    {
        HashSet<String> set=new HashSet<>();
        String d="";
          for(int i=1;i<=len;i++)
        {
             Node curr=root;
             while(curr.endofword!=true)
            {
             if(d.length()==i)
            {
                set.add(d);
              d=d.substring(1);
            }
             int j=0,flag=0;
            for( j=0;j<26;j++)
            {
                if(curr.children[j]!=null)
                {
                  int idx=j+'a';
                  char s=(char)idx;
                  d+=s;
                  flag=1;
                  break;
                }
            }
            if(flag==1)
            {
            curr=curr.children[j];
            }
         }
         set.add(d);
         d="";
        }   
       set.add(" ");
   System.out.println(set);
   System.out.println(set.size());

    }
    public static Node root=new Node();
    public static int len;
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
    public static int uni(Node root)
    {
        if(root==null)
        return 0;
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null)
            count+=uni(root.children[i]);
        }
        return count+1;
    }
    public static void main(String args[])
    {
    String words[]={"apple"};
    len=words[0].length();
   /*  for(int i=0;i<words.length;i++)
    {
        insert(words[i]);
    }
    unique();(First approach)*/
    for(int i=0;i<words[0].length();i++)
    {
       String d=words[0].substring(i);
       insert(d);
    }
     System.out.print(uni(root));
     
}
}
