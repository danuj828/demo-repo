class Solution {
    public int[] findErrorNums(int[] nums) {
        
        boolean[] visited = new boolean[10001];
        int n = nums.length;
        int duplicate = 0;
        int sum = 0;
        for(int i: nums){
            if(visited[i]){
                duplicate = i;
            }
            visited[i] = true;
            sum += i;
        }
        int ans = (n * (n+1)/2);
        return new int[] {duplicate, duplicate + ans - sum};
    }
}