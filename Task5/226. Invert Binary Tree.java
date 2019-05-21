class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)	return null;
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	queue.add(root);
    	while(!queue.isEmpty()) {
    		TreeNode poll = queue.poll();
    		TreeNode temp = poll.left;
    		poll.left = poll.right;
    		poll.right = temp;
    		if(poll.left != null)	queue.add(poll.left);
    		if(poll.right != null)	queue.add(poll.right);	
    	}
    	return root;
        
    }
}