class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.getOrDefault(i, 0) + 1 > nums.length / 2)   return i;
            else map.put(i, map.getOrDefault(i, 0) + 1);
        }
        return -1;
    }
}