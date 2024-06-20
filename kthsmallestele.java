public class kthsmallestele {
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

    public static int i=0;
     public static void smallest(Node root,int k)
    {
        if(root==null)
            {
                return;
            }
            smallest(root.left,k);
            
            i++;
            if(i==k)
            {
                System.out.println(root.data);
               return;
            }
            smallest(root.right,k);
    }
    public static void main(String[] args) {
        Node root=new Node(8);
       root.left=new Node(5);
       root.left.left=new Node(3);
       root.left.right=new Node(6);
       root.right=new Node(11);
       root.right.right=new Node(20);
       int k=2;
       smallest(root, k);
    }
}
