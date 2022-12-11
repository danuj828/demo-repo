class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int l1 = haystack.length();
        int l2 = needle.length();
        int limit = l1 - l2;
        if(l1 < l2){
            return -1;
        } else if(l2 == 0){
            return 0;
        }
        for(int i = 0; i<=limit; i++){
            if(haystack.substring(i, i+l2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}