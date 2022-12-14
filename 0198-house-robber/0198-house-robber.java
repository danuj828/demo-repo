class Solution {
    public int rob(int[] nums) {
        
        int n = nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        int val1 = nums[0], val2 = Math.max(val1, nums[1]);
        for(int i = 2; i<nums.length; i++){
            int temp = val2;
            val2 = Math.max(val2, nums[i] + val1);
            val1 = temp;
        }
        return val2;
    }
}