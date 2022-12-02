class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            set.add(nums[i]);
        }
        for(int i = 0; i<n; i++){
            int rev = reverse(nums[i]);
            set.add(rev);
        }
        return set.size();
    }
    public static int reverse(int n){
        int rev = 0;
        int rem;
        while(n>0){
            rem = n%10;
            rev = (rev*10)+rem;
            n = n/10;
        }
        return rev;
    }
}