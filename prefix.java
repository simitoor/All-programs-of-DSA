public class prefix {
    static class Node{
        Node []children=new Node[26];
        boolean endofword=false;
        int freq=1;
        Node()
        {
            for(int i=0;i<children.length;i++)
            {
                children[i]=null;
            }
        }
    }
    public static void prefixans(Node root,String ans)
    {
        if(root==null)
        {
            return;
        }
        if(root.freq==1)
        {
            System.out.println(ans);
            return;
        }
        for(int i=0;i<root.children.length;i++)
        {
            if(root.children[i]!=null)
            {
                prefixans(root.children[i],ans+(char)(i+'a'));
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
            else 
            {
                curr.children[idx].freq++;
            }
            curr=curr.children[idx];
        }
        curr.endofword=true;
     }
    public static Node root=new Node();
    public static void main(String[] args) {
        String words[]={"zebra","duck","dove","dog"};
        for(int i=0;i<words.length;i++)
        {
           insert(words[i]);
        }
        root.freq=-1;
        prefixans(root,"");
    }
}
