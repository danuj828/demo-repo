class Solution {
    public int lastRemaining(int n) {
        Stack<Integer> s = new Stack<>();
        int res = 1;
        while(n>1){
            n = n/2;
            s.push(n);
        }
        while(!s.isEmpty()){
            int ans = s.pop()-res;
            res = 2*(1 + ans);
        }
        return res;
    }
}