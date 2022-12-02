class Solution {
    public int minSteps(String s, String t) {
        
        //simple solution.
        
        // int m = s.length();
        // int n = t.length();
        // int ans = 0;
        // if(s.equals(t)){
        //     return 0;
        // }
        // int[] arr = new int[26];
        // for(int i = 0; i<m; i++){
        //     arr[s.charAt(i)-'a']++;
        //     arr[t.charAt(i)-'a']--;
        // }
        // for(int i: arr){
        //     if(i>0){
        //         ans += i;
        //     }
        // }
        // return ans;
        
        
        //Using hashmap
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>0){
                map.put(ch, map.get(ch)-1);
            } else {
                ans++;
            }
        }
        return ans;
    }
}