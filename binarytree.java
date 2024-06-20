import java.util.LinkedList;
import java.util.Queue;


public class binarytree {
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
    static class binarytrees
    {
        public static int idx=-1;
        public  Node bulidingtree(int arr[])
        {
            idx++;
            if(arr[idx]==-1)
            {
                return null;
            }
            Node newnode=new Node(arr[idx]);
            newnode.left=bulidingtree(arr);
            newnode.right=bulidingtree(arr);
            return newnode;
        }
        public  void preorder(Node root)
         {
            if(root==null)
            {
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
         }
        public  void inorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
             inorder(root.right);
        }
        public  void postorder(Node root)
        {
            if(root==null)
            {
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
         }
            public void levelprint(Node root)
            {
                if(root==null)
                {
                    return;
                }
                Queue<Node> q=new LinkedList<>();
                q.add(root);
                q.add(null);
                while(!q.isEmpty())
                {
                    Node curr=q.remove();
                    if(curr==null)
                    {
                        System.out.println();
                        if(q.isEmpty())
                        {
                            break;
                        }
                        else{
                            q.add(null);
                        }
                    }
                    else
                    {
                        System.out.print(curr.data+" ");
                        if(curr.left!=null)
                        {
                            q.add(curr.left);
                        }
                       if(curr.right!=null)   
                         {
                         q.add(curr.right);
                         }  
                         }
                }
            }
           public void klevelorder(Node root,int key)
            {
               if(root==null)
               {
                return;
               }
               Queue<Node> q=new LinkedList<>();
               q.add(root);
               q.add(null);
               int count=1;
               while(!q.isEmpty())
               {
                if(count==key){
                    while(!q.isEmpty())
                    {
                        System.out.print(q.remove().data);
                    }
                    break;
                }
                Node curr=q.remove();
                if(curr==null)
                {
                    count++;
                    if(q.isEmpty())
                    break;
                    else
                    q.add(null);
                }
                else{
                    if(curr.left!=null)
                    {
                        q.add(curr.left);
                    }
                    if(curr.right!=null)
                    {
                        q.add(curr.right);
                    }
                   }
                 }
            }
            public int height(Node root)
            {
                if(root==null)
                return 0;
                int lh=height(root.left);
                int rh=height(root.right);
                int height=Math.max(lh,rh)+1;
                return height;
            }
            public  int value=0;
            public int numberofnodes(Node root)
            {
                if(root==null)
                return 0;
                if(root!=null)
                {
                    value=value+1;
                }
                  numberofnodes(root.left);
                  numberofnodes(root.right);
                return value;
            }
            public static int sum=0;
            public int sumofnodes(Node root)
            {
                if(root==null)
                return 0;
                if(root!=null)
                {
                    sum+=root.data;
                }
                  sumofnodes(root.left);
                  sumofnodes(root.right);
                return sum;
            }
            public  int diameter(Node root)
            {
              if(root==null)
              return 0;
              int ldiameter=diameter(root.left);
              int rdiameter=diameter(root.right);
              int rheight=height(root.right);
              int lheight=height(root.left);
              int selfdiam=rheight+lheight+1;
              return Math.max( selfdiam,Math.max(rdiameter,ldiameter));
            }
            static class Info{
                int height;
                int diameter;
                Info(int height,int diameter)
                {
                    this.diameter=diameter;
                    this.height=height;
                }
            }
            public Info dimateroptimized(Node root)
            {
                if(root==null)
                 {
                    return new Info(0,0);
                 }
                Info leftin=dimateroptimized(root.left);
                Info rightin=dimateroptimized(root.right);
                int diameter=Math.max(leftin.height+rightin.height+1,Math.max(leftin.diameter,rightin.diameter));
                int height=Math.max(leftin.height,rightin.height)+1;
                return new Info(height,diameter);
            }
       
          
          }
          public static void main(String[] args) {
         int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         binarytrees a=new binarytrees();
         Node root=a.bulidingtree(arr);
       
         // System.out.println(root.data);
          //a.preorder(root);
         // a.inorder(root);
         //a.postorder(root);
        // a.levelprint(root);
       //System.out.println(a.height(root));
       //System.out.print(a.numberofnodes(root));
       System.out.print(a.sumofnodes(root));
       //System.out.print(a.diameter(root));
      // System.out.println(a.dimateroptimized(root).height);
// a.klevelorder(root, 1);
    }
}
