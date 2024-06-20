import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class treesubtreeofoneother {
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
    public static boolean isCompare(Node root,Node subroot)
    {
     if(root==null)
     return false;
     if(root.data==subroot.data)
     {
         if(identical(root,subroot))
         {
             return true;
         }
     }
     return isCompare(root.left, subroot)||isCompare(root.right, subroot);
    }
    static class Info1{
        int hd;
        Node node;
        Info1(Node node,int hd)
        {
            this.hd=hd;
            this.node=node;
        }
    }
      public static void topview(Node root)
    {
        Queue<Info1> q=new LinkedList<>();
        HashMap<Integer,Node> map=new HashMap<>();
        int min=0,max=0;
        q.add(new Info1(root,0));
        q.add(null);
        
        while(!q.isEmpty())
        {
              Info1 curr=q.remove();
              if(curr==null)
            {
              
                if(q.isEmpty())
                break;
                else{
                    q.add(null);
                }
            }
           
            else{
                if(!map.containsKey(curr.hd))
                {
                    map.put(curr.hd, curr.node);
                }
               if(curr.node.left!=null){
                q.add(new Info1(curr.node.left,curr.hd-1));
                
                min=Math.min(curr.hd-1,min);
               }
                if(curr.node.right!=null){
                q.add(new Info1(curr.node.right,curr.hd+1));
               max=Math.max(curr.hd+1, max);
                } 
             }
            }
            for(int i=min;i<=max;i++)
            {
                System.out.println(map.get(i).data+" ");
            }
            System.out.println();
        }
    public static boolean identical(Node root,Node subroot)
    {
        if(root==null && subroot==null)
        return true;
        else if(root==null||subroot==null||root.data!=subroot.data)
        return false;
        if(!identical(root.left, subroot.left))
        return false;
        if(!identical(root.right, subroot.right))
        return false;
        return true;
    }
      public static int distance(Node root,int n)
    {
        if(root==null)
        return -1;
        if(root.data==n)
        return 0;
         int d1=distance(root.left, n);
        int d2=distance(root.right, n);
        if(d1==-1 && d2==-1)
        return -1;
        else if(d2==-1){
            return d1+1;
        }
        else{
            return d2+1;
        }
    }
    public static int kthancestor(Node root,int key,int k)
    {
        if(root==null)
        return -1;
        if(root.data==key)
        return 0;
        int l=kthancestor(root.left, key,k);
        int r=kthancestor(root.right, key,k);
        if(l==-1 && r==-1){
        return -1;
        }
        int max=Math.max(l, r);
        if(max+1==k)
        {
           return root.data;
        }
        return max+1;
       }
    public static int minimum(Node root,int n1,int n2)
    {
      Node root1= lca2(root, n1, n2);
      int d1=distance(root1, n1);
      int d2=distance(root1, n2);
      return d1+d2;
    }
    public static int sumtotree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int lc=sumtotree(root.left);
        int rc=sumtotree(root.right);
        int data=root.data;
        int newleft=root.left==null?0:root.left.data;
        int newright=root.right==null?0:root.right.data;
        root.data=lc+newleft+rc+newright;
        return data;
    }
    public static boolean finding(ArrayList <Node> al,Node root,int n)
    {
        if(root==null)
        {
            return false;
          }
        al.add(root);
        if(root.data==n)
        {
            return true;
        }
        boolean left=finding(al, root.left, n);
        boolean right=finding(al, root.right, n);
        if(left||right)
        return true;
        al.remove(al.size()-1);
        return false;
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

    public static Node lca2(Node root,int n1,int n2)
    {
        if(root==null || root.data==n1 || root.data==n2)
        return root;
        Node leftlca=lca2(root.left,n1,n2);
        Node rightlca=lca2(root.right,n1,n2);
        if(rightlca==null)
        {
            return leftlca;
        }
        if(leftlca==null)
        return rightlca;
        return root;
    }
    public static int lca(Node root,int n1,int n2)
    {
        if(root==null)
        return 0;
         ArrayList <Node> al1=new ArrayList<>();
         ArrayList<Node> al2=new ArrayList<>();
         finding(al1,root,n1);
         finding(al2,root,n2);
         int i=0;
         for(;i<al1.size() && i<al2.size();i++)
         {
            if(al1.get(i)!=al2.get(i))
            break;
         }
        Node lca=al1.get(i-1);
        return lca.data;
    }
  
   
  public static void main(String[] args) {
        Node root=new Node(1);
         root.left=new Node(2);
         root.right=new Node(3);
         root.left.left=new Node(4);
         root.left.right=new Node(5);
         root.right.left=new Node(6);
         root.right.right=new Node(7);
       // Node root1=new Node(2);
       // root1.left=new Node(4);
       //root1.right=new Node(5);
      //System.out.println(isCompare(root,root1));
      //topview(root);
      //System.out.print(lca(root, 4, 5));
      //System.out.print(lca2(root, 4, 3).data);
     // System.out.print(minimum(root,4, 6));
     //System.out.print(kthancestor(root,4,1));
     sumtotree(root);
     preorder(root);
    }
}
