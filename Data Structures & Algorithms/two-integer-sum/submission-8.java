class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the required matching number was already seen
            if (map.containsKey(complement)) {
                // map.get(complement) is guaranteed to be a smaller index 
                // because it was added in an earlier iteration
                return new int[] { map.get(complement), i };
            }
            
            // If not found yet, store the current number and its index
            map.put(nums[i], i);
        }
        
        return new int[0];
    }
}