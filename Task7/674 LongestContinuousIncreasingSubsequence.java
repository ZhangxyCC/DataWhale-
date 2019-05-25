class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int count = nums.length == 0 ? 0 : 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1])   count++;
            else{
                if(count > res) res = count;
                count = 1;
            }
        }
        return res > count ? res : count;
    }
}