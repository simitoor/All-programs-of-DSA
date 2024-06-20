
public class sortedarraytobst {
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
    public static Node bulid(int arr[],int si,int ei)
     {
        int mid=(si+ei)/2;
        Node root=new Node(arr[mid]);
        if(si==ei)
        {
         return root;
        }
        root.left=bulid(arr,si,mid-1);
        root.right=bulid(arr,mid+1,ei);
        return root;
     }
 
    public static void main(String[] args) {
        int arr[]={3,5,6,8,10,11,12};
      //  int mid=arr.length/2;
        Node root=null;
       // Node root=new Node(arr[mid]);
        root=bulid(arr,0, arr.length-1);
        inorder(root);
    }
}
