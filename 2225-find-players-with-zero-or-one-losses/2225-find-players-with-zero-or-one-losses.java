class Solution {
    public List<List<Integer>> findWinners(int[][] arr) {
        int n = arr.length;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        ArrayList<Integer> list1 = new ArrayList<>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0; i<n; i++){
            if(map.containsKey(arr[i][1])){
                map.put(arr[i][1], map.get(arr[i][1])+1);
            } else {
                map.put(arr[i][1], 1);
            }
        }
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue()<=1){
                list1.add(e.getKey());
            }
        }
        TreeSet<Integer> ans = new TreeSet<>();
        for(int i = 0; i<n; i++){
            if(!map.containsKey(arr[i][0])){
                ans.add(arr[i][0]); 
            }
        }
        List<Integer> list2 = new ArrayList<>(ans);
        list.add(list2);
        list.add(list1);
        return list;
    }
}