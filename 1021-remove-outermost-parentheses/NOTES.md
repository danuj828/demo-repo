class Solution {
public String removeOuterParentheses(String S) {
Deque<Character> stack = new ArrayDeque<>();
StringBuilder res = new StringBuilder();
for (char c : S.toCharArray()) {
if (!stack.isEmpty()) res.append(c);
if (c == '(') stack.addFirst(c);
else stack.removeFirst();
if (stack.isEmpty()) res.deleteCharAt(res.length() - 1);
}
return res.toString();
}
}