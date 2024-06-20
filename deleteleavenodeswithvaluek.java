public class deleteleavenodeswithvaluek {
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
    public static Node deleteLeaves(Node root, int x)
    {
        if (root == null)
            return null;
        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);
     
        if (root.data == x && root.left == null && root.right == null) {
     
            return null;
        }
        return root;
    }
    public static void preorder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(3);
        root.right=new Node(3);
        root.left.left=new Node(3);
        root.left.right=new Node(2);
        root.right.right=new Node(3);
        root=deleteLeaves(root, 3);
        preorder(root);
    }

}
