class Solution {
    public int countPoints(String rings) {
        int[] red = new int[10];
        int[] green = new int[10];
        int[] blue = new int[10];
        for(int i = 0; i<rings.length(); i+=2){
            char ch = rings.charAt(i);
            int num = rings.charAt(i+1)-'0';
            if(ch == 'R'){
                red[num] = 1;
            }
            if(ch == 'G'){
                green[num] = 1;
            }
            if(ch == 'B'){
                blue[num] = 1;
            }
        }
        int count = 0;
        for(int i = 0; i<10; i++){
            if(red[i]==1 && green[i]==1 && blue[i]==1){
                count++;
            }
        }
        return count;
    }
}