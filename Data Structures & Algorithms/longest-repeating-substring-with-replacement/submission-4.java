class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        char[] arr = s.toCharArray();
        int i = 0;
        int max = 0;
        int cur = 0;
        int[] count = new int[26];
        Map<Character, Integer> map = new HashMap<>();
        for (; i < arr.length; i++) {
                count[arr[i] - 'A']++;
            
            
            while (i - left - getMax(count) + 1 > k) {
                count[arr[left] - 'A']--;
                left++;
            }
            cur = i - left + 1;
            if (cur > max) {
                max = cur;
            }
            
        }
        return max;
    }



    private int getMax(int[] arr) {
        int max = 0;
        for (int i : arr) {
            if (i > max) {
            max = i;
            }
        }
        return max;
    }
}
