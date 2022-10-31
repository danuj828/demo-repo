class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                
                int key = i-j;
                
                if(map.containsKey(key)){
                    if(map.get(key) != matrix[i][j])
                        return false;
                    
                } else {
                    map.put(i-j, matrix[i][j]);
                }
            }
        }
        return true; 
    }
}