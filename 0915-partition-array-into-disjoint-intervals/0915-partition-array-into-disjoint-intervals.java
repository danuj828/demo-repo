class Solution {
    public int partitionDisjoint(int[] nums) {
        int currentMax = nums[0];
        int index = 0;
        int max = currentMax;
        for(int i = 1; i<nums.length; i++){
            if(currentMax > nums[i]){
                currentMax = max;
                index = i;
            } else {
                max = Math.max(max, nums[i]);
            }
        }
        return index+1;
    }
}