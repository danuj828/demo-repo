class Solution {
    public int lengthOfLastWord(String s) {
        char[] ch = s.trim().toCharArray();
        int count = 0;
        for(int i = ch.length-1; i>=0; i--){
            if(ch[i] != ' '){
                count++;
            } else {
                break;
            }
        }
       return count;
    }
}