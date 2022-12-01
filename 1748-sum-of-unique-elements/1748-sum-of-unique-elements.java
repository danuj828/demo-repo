class Solution {
    public int sumOfUnique(int[] nums) {
        Set<Integer> dups = new HashSet<>(nums.length);
        Set<Integer> result = new HashSet<>(nums.length);
            
        for (int i : nums) {
        if(dups.add(i)){
        result.add(i);
        continue;
        }
        result.remove(i);
        }
        int sum = 0;
        for(int i: result){
            sum += i;
        }
        return sum;
    }
}