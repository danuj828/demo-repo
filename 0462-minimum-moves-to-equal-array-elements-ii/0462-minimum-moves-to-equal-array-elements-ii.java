class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        int mid = nums.length/2;
        for(int i = 0; i<nums.length; i++){
            ans += Math.abs(nums[mid] - nums[i]);
        }
        return ans;
    }
}