class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if (c == '(' || c == '['|| c == '{') {
                stack.push(c);
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (stack.peek() == '(' && c == ')') {
                stack.pop();
                continue;
            }
            if (stack.peek() == '[' && c == ']') {
                stack.pop();
                continue;
            }
            if (stack.peek() == '{' && c == '}') {
                stack.pop();
                continue;
            }
            return false;

        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

}
