public class twosumbst {
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
    public static int pairs=0;
     public static void sum1(Node root1,Node root2)
     {
        if(root1==null || root2==null)
        return;
        if(root1.data+root2.data==sum)
        {
        pairs++;
        System.out.println(root1.data +" "+root2.data);
         return;
        }
         sum1(root1, root2.left);
         sum1(root1, root2.right);
     }
     public static void sum2(Node root1,Node root2)
     {
       if(root1==null || root2==null)
       return;
       sum1(root1,root2);
       sum2(root1.left, root2);
       sum2(root1.right,root2);
     }
     public static int sum=16;
    public static void main(String[] args) {
        Node root1 = new Node(5);
        root1.left = new Node(3);
        root1.right = new Node(7);
        root1.left.left = new Node(2);
        root1.left.right = new Node(4);
        root1.right.left = new Node(6);
        root1.right.right = new Node(8);
        Node root2 = new Node(10);
        root2.left = new Node(6);
        root2.right = new Node(15);
        root2.left.left = new Node(3);
        root2.left.right=new Node(8);
        root2.right.left=new Node(11);
        root2.right.right=new Node(18);
       sum2(root1, root2);
       System.out.print(pairs);
    }
}
