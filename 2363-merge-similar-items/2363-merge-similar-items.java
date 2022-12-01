class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        int sum = 0;
        for(int[] i: items1){
          map.merge(i[0], i[1], Integer::sum);  
        }
        for(int[] i: items2){
          map.merge(i[0], i[1], Integer::sum);  
        }
        for(var n: map.entrySet()){
            list.add(Arrays.asList(n.getKey(), n.getValue()));
        }
        return list;
    }
}