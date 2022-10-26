class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        
        int n = nums.length;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        if(nums.length < 2){
            return false;
        }
        
        map.put(0, -1);
        for(int i = 0; i<n; i++){
            sum += nums[i];
            if(k != 0){
                sum = sum % k;
            }
            if(map.containsKey(sum)){
                if(i - (map.get(sum)) > 1){
                    return true;
                }
            } else {
                map.put(sum , i);
            }
        }
        return false;
    }
}