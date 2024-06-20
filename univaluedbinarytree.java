

public class univaluedbinarytree {
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
      public static boolean binary(Node root,int key)
      {
         if(root==null)
         return true;
          if(key!=root.data)
        return false;
        boolean left=binary(root.left, key);
        boolean right=binary(root.right, key);
        if(left!=true || right!=true)
         return false;
         return true;
      }
        
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(1);
        root.right=new Node(1);
        root.left.left=new Node(1);
        root.left.right=new Node(1);
        root.right.left=new Node(1);
        root.right.right=new Node(2);
        int key=root.data;
        System.out.print(binary(root,key));
    }
}
