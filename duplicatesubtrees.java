import java.util.HashMap;
public class duplicatesubtrees {
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
    public static String duplicate(HashMap<String,Integer> map,Node root)
    {
        if(root==null)
        return "";
        String str="(";
        str+=duplicate(map, root.left);
        str+=Integer.toString(root.data);
        str+=duplicate(map,root.right);
        str+=")";
        if(map.get(str)!=null && map.get(str)==1)
       {
        System.out.println(str);
        }
        if(map.containsKey(str))
        {
            
            map.put(str,map.get(str)+1);
        }
        else{
            map.put(str,1);
        }
        return str;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.left = new Node(2);
        root.right.left.left = new Node(4);
        root.right.right = new Node(4);
        HashMap<String,Integer>map=new HashMap<>();
        duplicate(map,root);
    }
}
}
