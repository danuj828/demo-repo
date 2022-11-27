class Solution {
    public int[] numberOfPairs(int[] arr) {
        int[] res = new int[2];
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            if(set.contains(i)){
                res[0]++;  //pair found.
                set.remove(i);   //pair found above so remove the element.
            } else {
                set.add(i);  //added to a set.
            }
        }
        res[1] = set.size();
        return res;
    }
}