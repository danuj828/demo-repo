class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i = num/2; i<=num; i++){
            int x = i;int  y = 0;
            while(x>0){   
            y = y * 10 + x%10;  
            x = x/10;
            }
            if(y+i == num){
                return true;
            }
        }
        return false;
    }
}