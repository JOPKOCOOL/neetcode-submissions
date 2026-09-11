class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int target = - nums[i];
            Set<Integer> set = new HashSet<>();
            for (int j = 0; j < nums.length; j++) {
                List<Integer> sorted = new ArrayList<>(List.of(nums[i], nums[j], target - nums[j]));
                Collections.sort(sorted);
                if (j == i) {
                    continue;
                }
                if (set.contains(target - nums[j]) && !result.contains(sorted)) {
                    result.add(sorted);
                }
                else {
                    set.add(nums[j]);
                }
            }
        }
        return result;
    }
}
