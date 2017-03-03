//assume the bst data structure is already provided
public class BSTMinimumDifference {
// q: given a bst find the max difference of two any nodes. 
    int min=Integer.MAX_VALUE;
    TreeNode pre=null;
    public int getMinimumDifference(TreeNode root) {
        if(root==null)return min;
        getMinimumDifference(root.left);
        
        if(pre!=null){
            min=Math.min(min,root.val-pre.val);
        }
        pre=root;
        getMinimumDifference(root.right);
        return min;
    }
   // since it is bst, so if we want a traverse it in sorted order, we need to use inorder technique, Then we easily get the max difference .
}
