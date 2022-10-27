class Solution {
    public boolean checkPowersOfThree(int N) {
       
        while(N > 0){
            if(N % 3 == 2){
                return false;
            }
            N = N/3;
        }
        return true;
    }
}