public class PathSum {
    // Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)return false;
        int i= root.val;
        if(root.left==null&&root.right==null)return i==sum;
        if(DFS(root.right,sum,i)||DFS(root.left,sum,i))return true;
        return false;
    }
    public static boolean DFS(TreeNode root,int sum,int i){
        if(root==null)return false;
        i+=root.val;
        if(root.left==null&&root.right==null)return i==sum;
        if(DFS(root.right,sum,i)||DFS(root.left,sum,i))return true;
        return false;
    }
    // simple DFS question, simple DFS solution.  
}
