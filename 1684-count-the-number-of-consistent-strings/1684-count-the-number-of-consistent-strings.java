class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
//         int n = words.length;
//         int[] temp = new int[26];
        
//         for(char c: allowed.toCharArray()){
//             temp[c-'a']++;
//         }
//         for(String i: words){
//             for(char c: i.toCharArray()){
//                 if(temp[c-'a']<=0){
//                     n--;
//                     break;
//                 }
//             }
//         }
//         return n;
        
        int count = 0;
        HashSet<Character> set = new HashSet<>();
        for(char c: allowed.toCharArray()){
            set.add(c);
        }
        for(String s: words){
            for(int i = 0; i<s.length(); i++){
                if(!set.contains(s.charAt(i))){
                    break;
                }
                if(i == s.length()-1){
                    count++;
                }
            }
        }
        return count;
    }
}