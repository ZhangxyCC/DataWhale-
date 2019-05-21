class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
         if(root == null)	return false;
         Stack<TreeNode> stack = new Stack<TreeNode>();
         int currentSum = 0;
         while(root != null || !stack.isEmpty()) {
        	 while(root != null) {
        		 currentSum += root.val;
        		 stack.push(root);
        		 root = root.right;       
        	 }
            
             TreeNode temp = stack.pop();
             if(temp.left == null && currentSum == sum)	return true;
             else if(temp.left != null){
            	 root = temp.left;
             }else {
            	 currentSum -= temp.val;
             }
             
         }
        return false;
 }
}