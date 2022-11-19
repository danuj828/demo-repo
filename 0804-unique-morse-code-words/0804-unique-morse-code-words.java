class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] d = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        
        HashSet<String> set = new HashSet<>();
        for(String w: words){
             StringBuilder sb = new StringBuilder();
            for(int i = 0; i<w.length(); i++)
               sb.append(d[w.charAt(i) - 'a']);
            set.add(sb.toString());
            }
        return set.size();  
    }
}