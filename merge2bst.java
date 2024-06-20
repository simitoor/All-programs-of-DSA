import java.util.ArrayList;

public class merge2bst {
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
    public static void inorderbalancedal(Node root,ArrayList<Integer> a1)
    {
        if(root==null)
        {
            return;
        }
        inorderbalancedal(root.left,a1);
         a1.add(root.data);
         inorderbalancedal(root.right,a1);
     }
    public static void merge(ArrayList<Integer> a1,ArrayList<Integer> a2,ArrayList<Integer> a)
    {
        int i=0,j=0;
       
       while(i<a1.size() && j<a2.size()){
           if(a1.get(i)<=a2.get(j)){
           a.add(a1.get(i));
           i++;
           }
           else{
            a.add(a2.get(j));
            j++;
           }
         }
        
         while(i<a1.size()){
         a.add(a1.get(i));
         i++;
         }
         while(j<a2.size())
         {
            a.add(a2.get(j));
            j++;
         }
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
    public static Node bulid(ArrayList<Integer> arr,int si,int ei)
    {
        if(si>ei)
       {
        return null;
       }
       int mid=(si+ei)/2;
       Node root=new Node(arr.get(mid));
       root.left=bulid(arr,si,mid-1);
       root.right=bulid(arr,mid+1,ei);
       return root;
    }
    public static void main(String[] args) {
       Node root1=new Node(2);
       root1.left=new Node(1);
       root1.right=new Node(4);
       ArrayList <Integer> a1=new ArrayList<>();
       inorderbalancedal(root1,a1);
         ArrayList <Integer> a2=new ArrayList<>(); 
       Node root2=new Node(9);
       root2.left=new Node(3);
       root2.right=new Node(12);
       inorderbalancedal(root2, a2);
       ArrayList <Integer> a=new ArrayList<>();
       merge(a1, a2, a);
        Node root=bulid(a, 0, a.size()-1);
      inorder(root);
    }
}
