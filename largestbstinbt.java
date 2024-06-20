public class largestbstinbt {
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
        boolean isBst;
        int max;
        int min;
        int size;
        public Info(boolean isBst,int size,int max,int min)
        {
            this.isBst=isBst;
            this.size=size;
            this.max=max;
            this.min=min;
        }
    }
    public static int maxBst=0;
    public static Info largest(Node root)
    {
      if(root==null)
      return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
      Info lInfo=largest(root.left);
      Info rInfo=largest(root.right);
      int size=lInfo.size+rInfo.size+1;
      int min=Math.min(root.data,Math.min(lInfo.min,rInfo.min));
      int max=Math.max(root.data,Math.max(lInfo.max,rInfo.max));
      if(lInfo.max>=root.data || rInfo.min<=root.data)
      return new Info(false, size,max,min);
      if(lInfo.isBst && rInfo.isBst)
      {
        maxBst=Math.max(maxBst,size);
      return new Info(true, size, max, min);
      }
      return new Info(false, size, max, min);
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
       Info info=largest(root); 
       System.out.print(maxBst);
    }
}
