public class closesteleinbst {
    static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static void real(Node root,int key)
    {
        if(root==null)
        return;
        if(root.data==key)
        {
        min_key=root.data;
        return;
        }
        if(min>Math.abs(root.data-key))
        {
            min=Math.abs(root.data-key);
            min_key=root.data;
        }
        if(root.data>key)
        real(root.left, key);
        else if(root.data<key)
        real(root.right, key);
    }
    public static int min=Integer.MAX_VALUE;
    
    public static int min_key=0;
  
    public static void main(String[] args) 
    {
       Node root=new Node(8);
       root.left=new Node(5);
       root.left.left=new Node(3);
       root.left.right=new Node(6);
       root.right=new Node(11);
       root.right.right=new Node(20);
       real(root,19);
       System.out.print(min_key);
    
    }
}
