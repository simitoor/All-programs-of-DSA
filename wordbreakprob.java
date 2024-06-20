public class wordbreakprob {
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
    public static boolean word(String s)
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
       if(i==s.length()-1){
        if(curr.endofword==true)
        {
          curr=root;
        }
    }
        else{
       if(curr.children[s.charAt(i+1)-'a']==null)
       {
       if(curr.endofword==true)
       {
         curr=root;
       }

       }
    } 
      }
       if(curr==root){
       return true;
       }
       return false;
     }
    public static Node root=new Node();
    public static void main(String[] args) {
        String words[]={"i","like","sam","samsung","any","thee"};
        for(int i=0;i<words.length;i++)
        {
            insert(words[i]);
        }
        System.out.println(word("ilikesamsung"));
    }
}
