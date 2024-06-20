import java.util.ArrayList;
public class rangesumofbst {
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
    public static void inorder(Node root,ArrayList <Integer> sb)
    {
        if(root==null)
        return;
        inorder(root.left, sb);
        sb.add(root.data);
        inorder(root.right,sb);
    }
    public static int sum=0;
    public static void print(ArrayList <Integer> sb,int n1,int n2)
    {
        int idx=0;
       for(int i=0;i<sb.size();i++)
       {
        if(sb.get(i)==n1)
        {
            idx=i;
            break;
        }
       }
       while(sb.get(idx)<=n2) 
       {
        sum+=sb.get(idx);
        idx++;
       }
       System.out.print(sum);
    }
    public static void main(String[] args) 
    {
        Node root=new Node(10);
        root.left=new Node(5);
        root.left.left=new Node(3);
        root.left.right=new Node(7);
        root.right=new Node(15);
        root.right.right=new Node(18);
       ArrayList <Integer> sb=new ArrayList<>();
       inorder(root, sb); 
       print(sb, 7, 15);
    }
}
