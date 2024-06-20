import java.util.ArrayList;

public class bsttobalancedbst {
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
    public static Node bulid(ArrayList<Integer> arr,int si,int ei)
    {
       int mid=(si+ei)/2;
       Node root=new Node(arr.get(mid));
       if(si==ei)
       {
        return root;
       }
       root.left=bulid(arr,si,mid-1);
       root.right=bulid(arr,mid+1,ei);
       return root;
    }
    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
         inorder(root.right);
    }
    public static void inorderbalancedal(Node root,ArrayList<Integer> sb)
    {
        if(root==null)
        {
            return;
        }
        inorderbalancedal(root.left,sb);
         sb.add(root.data);
         inorderbalancedal(root.right,sb);
         
    }
    public static void main(String[] args) {
        Node root=new Node(8);
        root.left=new Node (6);
        root.left.left=new Node (5);
        root.left.left.left=new Node (3);
        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
         ArrayList<Integer> sb=new ArrayList<>();
        inorderbalancedal(root,sb);
        System.out.print(sb);
        root=bulid(sb,0,sb.size()-1);
        inorder(root);
        
    }
}
