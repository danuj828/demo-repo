class Solution {
    public int largestOverlap(int[][] a, int[][] b) {
        
        int count = 0;
        for(int i = -a.length+1; i<a.length; i++){
            for(int j = -a.length+1; j<a.length; j++){
                count = Math.max(count, overlap(a, b, i, j));
            }
        }
        return count;
    }
    
    private int overlap(int[][] a, int[][] b, int rowoff, int coloff){
        int cnt = 0;
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[0].length; j++){
                if((i + rowoff < 0 || i + rowoff >= a.length) || (j + coloff < 0 || j + coloff >= a.length)){
                    continue;
                }
                if(b[i][j] + a[i + rowoff][j + coloff] == 2){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}