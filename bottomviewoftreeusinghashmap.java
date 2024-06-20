import java.util.*;
public class bottomviewoftreeusinghashmap
{
  static class Node
    {
        int data;
        int hd;
        Node left,right;
        public Node(int key)
         {
            this.data= key;
            this.hd=Integer.MAX_VALUE;
            this.left=this.right=null;
         }
    }
    public static void functions(Node root,int curr,int hd,TreeMap <Integer,int []> m)
    {
        if(root==null)
         return;
        if(!m.containsKey(hd))
        {
             m.put(hd, new int[]{root.data,curr});
        }
        else
        {
            int p[]=m.get(hd);
            if(p[1]<=curr)
            {
              p[1]=curr;
              p[0]=root.data;
            }
            m.put(hd, p);
        }
        functions(root.left, curr+1, hd-1, m);
        functions(root.right, curr+1, hd+1, m);
    
    }
   public static void printBottomView(Node root)
   {
    TreeMap<Integer,int[]> m=new TreeMap<>();
    functions(root,0,0,m);
    for (int [] a : m.values()) 
    {
        System.out.println(a[0]);
    }
   }
    public static void main(String[]args) 
    {
        Node root=new Node(20);
        root.left=new Node(8);
        root.right=new Node(22);
        root.left.left=new Node(5);
        root.left.right=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(25);
        root.left.right.left=new Node(10);
        root.left.right.right=new Node(14);
        System.out.println("Bottom view of the given binary tree:");
        printBottomView(root);
         
    
}
}

