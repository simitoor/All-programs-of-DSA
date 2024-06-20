public class invertbinarytree {
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
      public static boolean binary(Node root1,Node root2)
      {
       if(root1==null && root2==null)
       return true;
       else if(root1==null||root2==null||root1.data!=root2.data)
       return false;
       boolean left=binary(root1.left, root2.right);
       boolean right=binary(root1.right, root2.left);
       if(left!=true||right!=true)
       return false;
       return true;
      }
        
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        Node root1=new Node(1);
        root1.left=new Node(3);
        root1.right=new Node(2);
        root1.left.left=new Node(7);
        root1.left.right=new Node(6);
        root1.right.left=new Node(5);
        root1.right.right=new Node(4);   
        System.out.print(binary(root,root1));
        
}
}
