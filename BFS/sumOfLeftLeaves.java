public class sumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if(root==null||root.left==null&&root.right==null)return 0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null)sum+=root.left.val;
        return sum+sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
    }  // just basic questions of BFS
}
