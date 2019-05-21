class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
         if(root == null)	return false;
         Stack<TreeNode> stack = new Stack<TreeNode>();
         int currentSum = 0;
         while(root != null || !stack.isEmpty()) {
        	 while(root != null) {
        		 System.out.println("root.val:" + root.val);
        		 currentSum += root.val;
        		 System.out.println("currentSum:" + currentSum);
        		 stack.push(root);
        		 root = root.right;       
        	 }
            
             TreeNode temp = stack.pop();
             if(temp.left == null && temp.right == null && currentSum == sum)	return true;
             else if(temp.left != null){
            	 root = temp.left;
             }else {
            	 currentSum -= temp.val;
            	 System.out.println("currentSum:" + currentSum);
             }
             
         }
        return false;
 }
}