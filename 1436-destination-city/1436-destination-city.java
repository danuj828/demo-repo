class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> set = new HashSet<>();
        String result = "";
        for(int i = 0; i<paths.size(); i++){
            set.add(paths.get(i).get(0));
        }
        for(int i = 0; i<paths.size(); i++){
            if(!set.contains(paths.get(i).get(1))){
                result = paths.get(i).get(1);
                break;
            }
        }
        return result;
    }
}