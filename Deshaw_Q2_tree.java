 import java.util.*;

class TreeNode {
    int val;
    List<TreeNode> neighbors;

    public TreeNode(int val) {
        this.val = val;
       this.neighbors = new ArrayList<>();
    }
}

public class Deshaw_Q2_tree{
    
    public static int maxSum = 0;
    
    public static void findMaxSum(TreeNode node, int sum, Set<TreeNode> visited) {
        visited.add(node);
        sum += node.val;
        
        for (TreeNode neighbor : node.neighbors) {
            if (!visited.contains(neighbor)) {
                findMaxSum(neighbor, sum, visited);
            }
        }
        
        if (node.val > 0) {
            maxSum = Math.max(maxSum, sum);
        }
        
        visited.remove(node);
    }
    
    public static int getMaxSum(List<int[]> edges, int[] val) {
        int n = val.length;
        TreeNode[] nodes = new TreeNode[n];
        
        for (int i = 0; i <n; i++) {
            nodes[i] = new TreeNode(val[i]);
        }
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            
            nodes[u].neighbors.add(nodes[v]);
            nodes[v].neighbors.add(nodes[u]);
        }
        
        Set<TreeNode> visited = new HashSet<>();
        
        for (TreeNode node : nodes) {
            findMaxSum(node, 0, visited);
        }
        
        return maxSum;
    }
 public static void main(String[] args) {
    List<int[]> edges = new ArrayList<>();
    edges.add(new int[] {0, 1});
    edges.add(new int[] {1, 2});
    edges.add(new int[] {1, 3});
    edges.add(new int[] {2, 4});
    edges.add(new int[] {3, 5});
    
    int[] val = {1,2, 3, 4, -5, 6};
    
    int maxSum = getMaxSum(edges, val);
    System.out.println("Max sum: " + maxSum);
}

}

