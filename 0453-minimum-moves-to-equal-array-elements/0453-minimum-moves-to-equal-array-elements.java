class Solution {
    public int minMoves(int[] nums) {
        int ans = 0;
        int min = nums[0];
        for(int i: nums){
            min = Math.min(min, i);
        }
        for(int i: nums){
            ans += i - min;
        }
        return ans;
    }
}