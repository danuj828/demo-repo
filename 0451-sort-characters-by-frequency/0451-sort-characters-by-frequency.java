class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        List<Character>[] list = new List[s.length()+1];
        for(char i: map.keySet()){
            int freq = map.get(i);
            if(list[freq] == null){
                list[freq] = new ArrayList<>();
            }
            list[freq].add(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = list.length-1; i>=0; i--){
            if(list[i] != null){
                for(char ch: list[i]){
                    for(int j = 0; j<i; j++){
                        sb.append(ch);
                    }
                }
            }
        }
        return sb.toString();
    }
}