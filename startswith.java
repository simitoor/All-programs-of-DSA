
public class startswith {
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
    public static Node root=new Node();
    public static void starts(String s)
    {
        int flag=0;
        Node curr=root;
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]!=null)
            {
                curr=curr.children[idx];
            }
            else{
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.print("Not present");
        else
        System.out.print("Present");
    }
    public static void main(String arg[])
    {
        String words[]={"apple","thee","app","mango","man"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        starts("mon");
    }
}
