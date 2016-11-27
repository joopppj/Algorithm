public class FindAndRemoveLeaves{
        public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> leaves= new ArrayList<>();
        
        while (root!=null) {if(isLeave(root,leaves))root=null;res.add(leaves);leaves= new ArrayList<>();}
        return res;
    }
    public boolean isLeave(TreeNode node,List<Integer> leaves){        
        if (node.left == null && node.right == null) {
            leaves.add(node.val);                              // if it is already leave , just add it to current leaves list
            return true;
        }
        
        if (node.left != null) {
             if(isLeave(node.left, leaves))  node.left = null;          // if it has left node , do recursion(DFS) on that node until it achieves leave
        }
        
        if (node.right != null) {
             if(isLeave(node.right, leaves)) node.right = null;         // same as above
        }
        
        return false;
    }
}
