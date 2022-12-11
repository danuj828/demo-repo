class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if(digits.length() == 0){
            return list;
        }
        HashMap<Character, String> map = buildMap();
        solve(digits, 0, list, map, "");
        return list;
    }
    private HashMap<Character, String> buildMap(){
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        return map;
    }
    private void solve(String digits, int index, List<String> list, HashMap<Character, String> map, String ans){
        if(index == digits.length()){
            list.add(ans);
            return;
        }
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i<letters.length(); i++){
            String str = ans + letters.charAt(i);
            solve(digits, index + 1, list, map, str);
        }
    }
}