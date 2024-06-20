public class maximumsumbst {
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
    static class Info{
        int size;
        boolean isBst;
        int min;
        int max;
        int sum;
        public Info(boolean isBst,int size,int min,int max,int sum)
        {
            this.isBst=isBst;
            this.size=size;
            this.min=min;
            this.max=max;
            this.sum=sum;
        }
    }
    public static int ans=0;
    public static Info real(Node root)
    {
        if(root==null)
        return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE,0);
        Info linfo=real(root.left);
        Info Rinfo=real(root.right);
        int min=Math.min(root.data,Math.min(linfo.min,Rinfo.min));
        int max=Math.max(root.data,Math.max(linfo.max,Rinfo.max));
        int size=linfo.size+Rinfo.size+1;
        int sum=root.data+linfo.sum+Rinfo.sum;
        if(linfo.max>=root.data || Rinfo.min<=root.data)
        return new Info(false,size,min,max,sum);
        if(linfo.isBst && Rinfo.isBst){
            ans=Math.max(ans,sum);
       return new Info(true,size,min,max,sum);
          }
        return new Info(false,size,min,max,sum);
    }
     public static void main(String[] args) {
        Node root=new Node(50);
        root.left=new Node(30);
        root.left.left=new Node(5);
        root.left.right=new Node(20);
        root.right=new Node(60);
        root.right.left=new Node(45);
        root.right.right=new Node(70);
        root.right.right.left=new Node(65);
        root.right.right.right=new Node(80);
        real(root);
        System.out.print(ans);
    }
}
