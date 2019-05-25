class Solution {
      public List<List<Integer>> permute(int[] nums) {
    	List<Integer> a = new ArrayList<>();
    	for(int i : nums)	a.add(i);
        return helper(a);
    }
     public List<List<Integer>> helper(List<Integer> nums){
        List<List<Integer>> res = new ArrayList<>();
        if(nums.size() == 1)   {
        	res.add(nums);
        	return res;
        }
        for(int n : nums){
            List<Integer> temp = new ArrayList<>();
            for(int i : nums){
                if(i != n)  temp.add(i);
            }
            for(List<Integer> list : helper(temp)){
                list.add(0, n);
                res.add(list);
            }
        }
        return res;
    }
}