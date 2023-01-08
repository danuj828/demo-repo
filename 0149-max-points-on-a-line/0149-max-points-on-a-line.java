class Solution {
    HashMap<ArrayList<Double> , HashSet<ArrayList<Integer>>> map = new HashMap<>(); 
    public int maxPoints(int[][] p) {
        int max = 0;
        if (p.length == 1) return 1;
        for (int i = 0 ; i < p.length - 1 ; i++){
            for (int j = i+1 ; j < p.length ; j++) {
                ArrayList<Double> temp = new ArrayList<>();
                int div = (p[i][0] - p[j][0]);
                if (div != 0) {
                     temp.add((double)(p[i][1] - p[j][1])/div);
                     temp.add((double)(p[j][1]*p[i][0] - p[j][0]*p[i][1])/div);
                }else{
                     temp.add((double)Double.MAX_VALUE);
                     temp.add((double)p[i][0]);
                }
                if (map.containsKey(temp)) {
                    ArrayList<Integer> temparr  = new ArrayList<Integer>();
                    temparr.add(p[i][0]);
                    temparr.add(p[i][1]);
                    map.get(temp).add(temparr);
                    temparr  = new ArrayList<Integer>();
                    temparr.add(p[j][0]);
                    temparr.add(p[j][1]);
                    map.get(temp).add(temparr);
                }else{
                    HashSet<ArrayList<Integer>> tempset = new HashSet<ArrayList<Integer>>();
                    ArrayList<Integer> temparr  = new ArrayList<Integer>();
                    temparr.add(p[i][0]);
                    temparr.add(p[i][1]);
                    tempset.add(temparr);
                    map.put(temp , tempset);
                    temparr  = new ArrayList<Integer>();
                    temparr.add(p[j][0]);
                    temparr.add(p[j][1]);
                    map.get(temp).add(temparr);
                }
                // System.out.println(map);
                max = Math.max(max , map.get(temp).size());
            }    
                
        }
        return max;
    }
}