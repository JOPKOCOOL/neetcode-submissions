class Solution {
    public boolean isPalindrome(String s) {
        String real = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String beginning = "";
        String end = "";
        for (int i = 0; i < real.length() / 2; i++) {
            beginning = beginning + real.charAt(i);
        }
        if (real.length() % 2 == 0) {
            for (int i = real.length() - 1; i > real.length() / 2 - 1; i--) {
                end = end + real.charAt(i);
            }
        }
        else {
            for (int i = real.length() - 1; i > real.length() / 2; i--) {
                end = end + real.charAt(i);
            }
        }
        return beginning.equals(end);
    }
}
