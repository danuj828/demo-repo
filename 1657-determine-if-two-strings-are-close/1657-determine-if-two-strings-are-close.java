class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        if(word1.length() != word2.length()){
            return false;
        }
        
        // for(int i = 0; i<word1.length(); i++){
        //     if(map1.containsKey(ch1)){
        //         map1.put(ch1, map1.get(ch1)+1);
        //     } else {
        //         map1.put(ch1, 1);
        //     }
        // }
        
        for(char ch: word1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0)+1);
        }
        
        // for(int i = 0; i<word1.length(); i++){
        //     if(map2.containsKey(ch2)){
        //         map2.put(ch2, map2.get(ch2)+1);
        //     } else {
        //         map2.put(ch2, 1);
        //     }
        // }
        
        for(char ch: word2.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0)+1);
        }
        
        if(!map1.keySet().equals(map2.keySet())){
            return false;
        }
        
        ArrayList<Integer>list1 = new ArrayList<>(map1.values());
        ArrayList<Integer>list2 = new ArrayList<>(map2.values());
        Collections.sort(list1);
        Collections.sort(list2);
        return list1.equals(list2);
    }
}