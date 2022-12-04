class Solution {
    public long dividePlayers(int[] arr) {
        Arrays.sort(arr);
        // 1,2,3,3,4,5
        int s = arr[0];
        int e = arr[arr.length-1];
        int ans = s+e;
        long res = 0;
        
        for(int i = 0; i<arr.length/2; i++){
           if(ans != (arr[i] + arr[arr.length-i-1])){
               return -1;
           }
             res += arr[i] * arr[arr.length-i-1];
        }
        return res;
    }
}