class Solution {
    public int balancedStringSplit(String s) {
        int n = s.length();
        int count = 0;
        int res = 0;
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == 'R'){
                count += 1;
            } else {
                count -= 1;
            }
            if(count == 0){
                res++;
            }
        }
        return res;
    }
}