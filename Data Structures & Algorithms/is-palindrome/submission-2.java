class Solution {
    public boolean isPalindrome(String s) {
        String real = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = real.length() - 1;
        while (left < right) {
            if (real.charAt(left) != real.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
