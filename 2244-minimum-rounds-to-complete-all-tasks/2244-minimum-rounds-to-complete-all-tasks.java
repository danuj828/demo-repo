class Solution {
    public int minimumRounds(int[] tasks) {
        int count = 0;
        int n = tasks.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i: tasks){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1){
                return -1;
            }
            count += entry.getValue()/3;
            if(entry.getValue() % 3 != 0){
                count++;
            }
        }
        return count;
    }
}