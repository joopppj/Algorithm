public class PathSumII {
    // Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum. 
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        int i=root.val;
        List<Integer> l= new ArrayList<>();
        l.add(i);
        DFS(list,l,root,i,sum);
        return list;
    }
    public static void DFS(List<List<Integer>> list,List<Integer> l, TreeNode root,int i,int sum){
        if(root.left==null&&root.right==null&&i==sum)list.add(l);
        if(root.left!=null){
            List<Integer> ll= new ArrayList<>(l);
            ll.add(root.left.val);
            DFS(list,ll,root.left,i+root.left.val,sum);}
        if(root.right!=null){
            //List<Integer> lll= new ArrayList<>(l);
            l.add(root.right.val);
            DFS(list,l,root.right,i+root.right.val,sum);}
    }
    // simple DFS question, just pay attention to the fact that list is keeping updated , so we need to get a copy of them in every recursion
}
