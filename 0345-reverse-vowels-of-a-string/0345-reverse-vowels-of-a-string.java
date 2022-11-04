class Solution {
    public String reverseVowels(String s) {
        
        int i = 0;
        int j = s.length()-1;
        char[] str = s.toCharArray();
        
        while(i < j){
            if(!vowel(str[i])){
                i++;
                continue;
            }
            if(!vowel(str[j])){
                j--;
                continue;
            }
            char ch = str[i];
            str[i] = str[j];
            str[j] = ch;
            
            i++;
            j--;
        }
        String string = String.copyValueOf(str);
        return string;
    }
    static boolean vowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    } 
}