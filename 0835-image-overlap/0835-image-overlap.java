class Solution {
    public int largestOverlap(int[][] a, int[][] b) {
        
        int n = a.length;
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i<n*n; i++){
            if(a[i/n][i%n] == 1){
                list1.add(i/n*100 + i%n);
            }
        }
        
        for(int i = 0; i<n*n; i++){
            if(b[i/n][i%n] == 1){
                list2.add(i/n*100 + i%n);
            }
        }
        
        for(int i:list1){
            for(int j:list2){
                 map.put(i-j, map.getOrDefault(i-j, 0)+1);
            }
        }
        
        int res = 0;
        for(int i: map.values()){
            res = Math.max(res, i);
        }
        return res;
    }
}