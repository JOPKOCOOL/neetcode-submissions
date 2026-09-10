class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && nums[i] * 2 == target) {
                arr[0] = map.get(nums[i]);
                arr[1] = i;
                return arr;
            }
            map.put(nums[i], i);
        }
        for (int i : nums) {
            if (map.containsKey(target - i) && i != target - i) {
                arr[0] = map.get(i);
                arr[1] = map.get(target - i);
                return arr;
            }
        }
        return arr;
    }
}
