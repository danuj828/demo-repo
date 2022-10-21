class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        int num1 = -1, num2 = -1, c1 =0, c2 = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == num1){
                c1++;
            } else if(nums[i] == num2){
                c2++;
            } else if(c1 == 0){
                num1 = nums[i];
                c1 = 1;
            } else if(c2 == 0){
                num2 = nums[i];
                c2 = 1;
            } else {
                c1--;
                c2--;
            }
        }
        
        c1 = 0;
        c2 = 0;
        for(int i = 0; i<n; i++){
            if(nums[i] == num1){
                c1++;
            } else if(nums[i] == num2){
                c2++;
            }
        }
        if(c1 > (n/3)){
            list.add(num1);
        }
        if(c2 > (n/3)){
            list.add(num2);
        }
        return list;
    }
}