class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        int max = 0;
        int prev = -1;
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            if(max == i){
                ans.add(max-prev);
                prev = max;
            }
        }
        return ans;
    }
}