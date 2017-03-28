
public class FindBottomLeftValue {
    // find the value of the most left node of the most botton line of nodes in a BST. 
    int ans=0;
    int h=0;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 1);
        return ans;
    }
    public void findBottomLeftValue(TreeNode root, int depth) {
        if (h<depth) {ans=root.val;h=depth;}
        if (root.left!=null) findBottomLeftValue(root.left, depth+1);
        if (root.right!=null) findBottomLeftValue(root.right, depth+1);
    }
    // basically we use bfs technique.  the difficult point is that this algorithm use depth and h to compare to make sure that for every line, only one ( the most left) will be called. 
}
