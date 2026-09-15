class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        if (s1.length() > s2.length()) {
            return false;
        }
        for (int j = 0; j < s1.length(); j++) {
            arr[s1.charAt(j) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }
        int right = s1.length() - 1;
        for (int i = 0; i < s2.length(); i++) {
            if (Arrays.equals(arr, arr2)) {
                return true;
            }          
            right++;
            if (right >= s2.length()) {
                break;
            }
            arr2[s2.charAt(i) - 'a']--;
            arr2[s2.charAt(right) - 'a']++;
        }
        return false;
    }
}
