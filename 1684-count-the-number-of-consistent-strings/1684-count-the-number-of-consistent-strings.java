class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int n = words.length;
        int[] temp = new int[26];
        
        for(char c: allowed.toCharArray()){
            temp[c-'a']++;
        }
        for(String i: words){
            for(char c: i.toCharArray()){
                if(temp[c-'a']<=0){
                    n--;
                    break;
                }
            }
        }
        return n;
    }
}