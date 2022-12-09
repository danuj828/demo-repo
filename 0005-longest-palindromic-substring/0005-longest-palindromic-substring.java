class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[n][n];
        for(int i = n-1; i>=0; i--){
            for(int j = i; j<n; j++){
                dp[i][j] = (s.charAt(i) == s.charAt(j)) && (j-i < 3 || dp[i+1][j-1]);
            
            if(dp[i][j] && (j-i+1>end)){
                start = i;
                end = j-i+1;
                }
            }
        }
        return s.substring(start, start+end);
    }
}