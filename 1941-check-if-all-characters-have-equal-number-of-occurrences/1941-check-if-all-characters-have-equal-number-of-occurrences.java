class Solution {
    public boolean areOccurrencesEqual(String s) {
        int[] frequencies = new int[26];
        for(char c: s.toCharArray()){
            frequencies[c-'a']++;
        }
        int prev = frequencies[s.charAt(0)-'a'];
        for(int n: frequencies){
            if(n !=0 && n != prev){
                return false;
            }
        }
        return true;
    }
}