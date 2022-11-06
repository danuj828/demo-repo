class Solution {
    public String orderlyQueue(String s, int k) {
        
        if(k > 1){
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }
        String res = s;
        String doubleS = s + s;
        for (int i = 1; i < s.length(); i++) {
            String rotate = doubleS.substring(i, i + s.length());
            if (res.compareTo(rotate) > 0)
                res = rotate;
        }
        return res;
    }
}