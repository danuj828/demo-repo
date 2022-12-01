class Solution {
    public boolean halvesAreAlike(String s) {
        
        
        int mid = s.length()/2;
        int ans = 0;
        String vowels = "aeiouAEIOU";
        
        for(int i = 0; i<mid; i++){
            for(int j = mid; j<s.length(); j++){
                if(vowels.indexOf(s.charAt(i))>=0) ans++;
                if(vowels.indexOf(s.charAt(j))>=0) ans--;
            }
        }
       return ans==0;  
    }
}