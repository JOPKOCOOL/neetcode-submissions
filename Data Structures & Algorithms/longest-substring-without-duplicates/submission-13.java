class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        int ctr = 0;
        int max = 0;
        int left = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);

            } else {
                ctr = i - left;
                if (ctr > max) {
                    max = ctr;
                }
                while (arr[left] != arr[i]) {
                    set.remove(arr[left]);
                    left++;
                }
                left++;
            }
        }
        ctr = i - left;
        if (ctr > max) {
            max = ctr;
        }
        return max;
    }
}
