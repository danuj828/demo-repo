class Solution {
    public boolean checkIfPangram(String sentence) {
        
        boolean present = true;
        for(char ch = 'a'; ch <= 'z'; ch++){
            if(!sentence.contains(String.valueOf(ch))){
                present = false;
                break;
            }
        }
        if(present){
            return true;
        } else {
            return false;
        }
    }
}