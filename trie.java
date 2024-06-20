public class trie {
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
    public static boolean search(String s)
    {
        Node curr=root;
        for(int i=0;i<s.length();i++)
        {
            int idx=s.charAt(i)-'a';
            if(curr.children[idx]==null)
            {
                return false;
            }
            curr=curr.children[idx];
        }
        if(curr.endofword==true)
        {
            return true;
        }
        return false;
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
    public static void main(String[] args) {
        String words[]={"the","a","there","their","any","thee"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(search("an"));
    }
}
