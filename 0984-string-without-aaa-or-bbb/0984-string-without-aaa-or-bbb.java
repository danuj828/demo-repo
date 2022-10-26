class Solution {
    public String strWithout3a3b(int a, int b) {
        
        StringBuilder sb = new StringBuilder(a + b);
        while(a + b > 0){
            String s = sb.toString();
            if(s.endsWith("aa")){
                sb.append("b");
                b--;
            } else if(s.endsWith("bb")){
                sb.append("a");
                a--;
            } else if(a >= b){
                sb.append("a");
                a--;
            } else if(b >= a){
                sb.append("b");
                b--;
            }
        }
        return sb.toString();
    }
}