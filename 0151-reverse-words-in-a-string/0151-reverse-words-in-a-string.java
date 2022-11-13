class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split(" +");
        Collections.reverse(Arrays.asList(arr));
        return String.join(" ", arr);
    }
}