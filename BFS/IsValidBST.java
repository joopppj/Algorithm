public class IsValidBST{
  public boolean isValidBST(TreeNode root) {
        if(root==null)return true;
        if(root.left==null||root.left.val<root.val){
            if(root.right==null||root.right.val>root.val){
                return LBFS(root.left,root.val,Integer.MIN_VALUE)&&RBFS(root.right,root.val,Integer.MAX_VALUE);
            }
            else return false;
        }
        else return false;

    }
    public static boolean RBFS(TreeNode root, int min,int max){
        if(root==null)return true;
        if(root.left==null||root.left.val<root.val&&root.left.val>min&&root.left.val<max){
            if(root.right==null||(root.right.val>root.val&&root.right.val<max)||root.right.val==Integer.MAX_VALUE){
                return LBFS(root.left,root.val,min)&&RBFS(root.right,root.val,max);
            }
            else return false;
        }
        else return false;
    }
    public static boolean LBFS(TreeNode root, int max,int min){
        if(root==null)return true;
        if(root.left==null||(root.left.val<root.val&&root.left.val>min)||root.left.val==Integer.MIN_VALUE){
            if(root.right==null||(root.right.val>root.val&&root.right.val<max&&root.right.val>min)){
                return LBFS(root.left,root.val,min)&&RBFS(root.right,root.val,max);
            }
            else return false;
        }
        else return false;
    }
}
