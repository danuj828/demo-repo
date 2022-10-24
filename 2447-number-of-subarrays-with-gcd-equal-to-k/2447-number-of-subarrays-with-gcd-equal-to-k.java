class Solution {
    public int subarrayGCD(int[] nums, int k) {
        
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            int g = nums[i];
            for(int j=i;j<nums.length && g >= k;j++){ 
                if((g = gcd(g, nums[j])) == k)
                    count++;  
            }
        }
        return count;
    }
   public int gcd(int a, int b){
        return a==0?b:gcd(b%a, a);
    }
}