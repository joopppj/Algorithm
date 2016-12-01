public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        
        List<Integer> res=new ArrayList<Integer>();
        if(root!=null)res.add(root.val);
        DFS(res,root);
        return res;
    }
    public static void DFS(List<Integer> res,TreeNode root){
        if(root==null)return; 
        if(root.left!=null){res.add(root.left.val);DFS(res,root.left);}
        if(root.right!=null){res.add(root.right.val);DFS(res,root.right);}
        
    }
    
    // a very simple application of DFS, just doing simple DFS rescursion , which can print node values one by one in preorder.
    
    /*public List<Integer> preorderTraversal(TreeNode node) {
	List<Integer> list = new LinkedList<Integer>();
	Stack<TreeNode> rights = new Stack<TreeNode>();
	while(node != null) {
		list.add(node.val);
		if (node.right != null) {
			rights.push(node.right);
		}
		node = node.left;
		if (node == null && !rights.isEmpty()) {
			node = rights.pop();
		}
	}
    return list;
}*/   // or we can also use stack to store right nodes then left nodes , then pop left node then right nodes, we can get result with right order
}
