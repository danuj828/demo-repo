class Solution {
    public int maximum69Number (int num) {
        
        return Integer.parseInt(new String(num + "").replaceFirst("6","9"));
        
    }
}