public class closestValue {
    
    public static int closestValue(TreeNode root, double target) {
        // question :Given a non-empty binary search tree and a target value, find the value in the BST that is closest to the target.
        double diff= Math.abs(root.val - target);   // current difference between current node value and target
        int currv=root.val;       // current value
        TreeNode currt=root;         // current node
        while(currt!=null){
            if(diff>Math.abs(currt.val-target)){
                diff = Math.abs(currt.val-target);
                currv = currt.val;
            }
            
            if (currt.val < target) {
                currt = currt.right;
            } else if (currt.val > target) {
                currt = currt.left;
            } else {
                break;
            }
        }  
        return currv;
    }
    // this question needs iteration , and the running time is logn, we need to keep updating three values: current node/value/difference between current value and target.
}
