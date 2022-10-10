class Solution {
    int count = 0;
    public int numberOfSteps(int num) {
        // int count=0;
        // while(num>0){
        // if(num%2==0){
        //     num = num/2;
        //     count++;
        //    } else {
        //     num = num-1;
        //     count++;
        //   }
        // }
        // return count;
        
        if(num==0){
            return 0;
        } else {
            count++;
            print(num);
        }
        return count;
    }
    public void print(int num){
        if(num==1){
            return;
        }
        if(num%2==0){
            count++;
            print(num/2);
        } else {
            count++;
            print(num-1);
        }
    }
}