class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();

        for (String s : strs) {
            String s2 = sorted(s);
            if (map.containsKey(s2)) {
                map.get(s2).add(s);
            }
            else {
                map.put(s2, new ArrayList<>());
                map.get(s2).add(s);
            }
        
        
        }
        for (Map.Entry<String, List<String>> e : map.entrySet()) {
            result.add(e.getValue());
        }
        return result;
    }


    private String sorted(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }



    private boolean anagram(String s, String t) {
        int[] arr = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int i : arr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
