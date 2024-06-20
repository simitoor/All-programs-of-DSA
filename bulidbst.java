import java.util.ArrayList;
public class bulidbst {
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
    public static Node bulid(Node root,int key)
    {
       if(root==null)
       {
        root=new Node(key);
        return root;
       }
       if(root.data>key)
       {
        root.left=bulid(root.left, key);
       }
       else{
        root.right=bulid(root.right, key);
       }
       return root;
    }
    public static boolean left1;
    public static boolean right1;
    public static Node delete(Node root,int key)
     {
        if(root.data>key)
        {
            root.left=delete(root.left, key);
        }
        else if(root.data<key)
        {
           root.right=delete(root.right, key);
        }
        else
        {
            if(root.left==null && root.right==null)
            return null;
            if(root.left==null)
            return root.right;
            else if(root.right==null)
            return root.left;
             Node is=inordersuccessor(root.right);
                root.data=is.data;
                root.right=delete(root.right,is.data);
         }
        return root;
     }
     public static void printinrange(Node root,int k1,int k2)
    {
        if(root==null)
        return;
           if(k1<=root.data && root.data<=k2)
         {
          printinrange(root.left,k1,k2);
          System.out.print(root.data+" ");
          printinrange(root.right,k1,k2);
         }
      else if(root.data<k1)
      printinrange(root.right, k1, k2);
      else if(root.data>k2)
      printinrange(root.left, k1, k2);
    }
    public static boolean validbst(Node root,Node min,Node max)
     {
        if(root==null)
        return true;
        if(min!=null && min.data>=root.data)
        return false;
        if(max!=null && max.data<=root.data)
        return false;
        return validbst(root.left, min,root) && validbst(root.right,root, max);
     }
    public static void roottonode(Node root,ArrayList<Integer> sb)
    {
        sb.add(root.data);
        if(root.left==null && root.right==null){
        System.out.println(sb);
        return;
        }
          if(root.left==null){
        roottonode(root.right,sb);
        sb.remove(sb.size()-1);
          }
         else if(root.right==null){
        roottonode(root.left,sb);
        sb.remove(sb.size()-1);
         }
        else {
            roottonode(root.left,sb);
            sb.remove(sb.size()-1);
            roottonode(root.right,sb);
            sb.remove(sb.size()-1);
        }
     }
    public static Node inordersuccessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }
    public static boolean search(Node root,int key)
    {
        if(root==null)
        return false;
        if(root.data==key)
        return true;
        if(root.data>key)
        return search(root.left, key);
        else 
        return search(root.right, key);
      }
    public static Node mirrorbst(Node root)
    {
        if(root==null)
        return null;
        if(root.left==null && root.right==null)
        return root;
        Node m1=mirrorbst(root.left);
        Node m2=mirrorbst(root.right);
        root.left=m2;
        root.right=m1;
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
    public static void main(String[] args) 
     {
        int arr[]={8,5,3,6,10,11,14};
        Node root=null;
        for(int i=0;i<arr.length;i++)
        {
          root=bulid(root,arr[i]);
        }
        ArrayList<Integer> sb=new ArrayList<>();
      // inorder(root);
       //System.out.print(search(root, 7));
       //root=delete(root,1);
       // inorder(root);
        //printinrange(root, 2, 4);
        roottonode(root,sb);
       //System.out.print(validbst(root,null,null));
       root=mirrorbst(root);
       inorder(root);
     }
}
