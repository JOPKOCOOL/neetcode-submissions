class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        for (int j = 0; j < s1.length(); j++) {
            arr[s1.charAt(j) - 'a']++;
        }
        int[] arr2 = arr.clone();
        int right = s1.length() - 1;
        for (int i = 0; i < s2.length(); i++) {
            if(arr[s2.charAt(i) - 'a'] <= 0) {
                continue;
            }
            right = i;
            while (arr[s2.charAt(right) - 'a'] > 0 && right < s2.length()) {
                arr[s2.charAt(right) - 'a']--;
                right++;
                if (right == s2.length()) {
                    break;
                }
            }
            if (right - i == s1.length()) {
                return true;
            }
            arr = arr2.clone();

        }
        return false;
    }
}
