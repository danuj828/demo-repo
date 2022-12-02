class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();
        for(String word: words){
            if(match(word, pattern)){
                list.add(word);
            }
        }
        return list;
    }
    public static boolean match(String words, String pattern){
        for(int i = 0; i<words.length(); i++){
            if(words.indexOf(words.charAt(i)) != pattern.indexOf(pattern.charAt(i))){
                return false;
            }
        }
        return true;
    }
}