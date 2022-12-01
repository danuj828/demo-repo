class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            int curr = groupSizes[i];
            map.computeIfAbsent(curr, l -> new ArrayList<>()).add(i);
        if(map.get(curr).size()==curr){
            list.add(map.remove(curr));
            }
        }
        return list;
    }
}