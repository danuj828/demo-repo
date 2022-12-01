class Solution {
    public int repeatedNTimes(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i, map.getOrDefault(i, 0)+1);
            if(map.get(i)>1){
                return i;
            }
        }
        return -1;
        
        
        // HashSet<Integer> set = new HashSet<>();
        // int ans = 0;
        // for(int i: nums){
        //     if(set.contains(i)){
        //         return i;
        //     } else {
        //         set.add(i);
        //     }
        // }
        // return -1;
    }
}