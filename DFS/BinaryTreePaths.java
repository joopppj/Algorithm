public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        //Given a binary tree, return all root-to-leaf paths represented by strings.
        List res=new ArrayList<String>();
        if(root==null)return res;
        String s=""+root.val;
        //DFS(res,root,s);
        if(root.left!=null)DFS(res,root.left,s);
        if(root.right!=null)DFS(res,root.right,s);
        if(root.left==null&&root.right==null)res.add(s);
        return res;
    }
    public static void DFS(List res,TreeNode t,String s){
        if(t.left==null&&t.right==null){
            s=s+"->"+t.val;
            res.add(s);
        }
        s=s+"->"+t.val;
        if(t.left!=null)DFS(res,t.left,s);
        if(t.right!=null)DFS(res,t.right,s);
    }// very simple questions , just using a recursion method is enough .
}
