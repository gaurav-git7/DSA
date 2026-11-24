class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(); // num -> index

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // Check if complement is already seen
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Otherwise store current num and index
            map.put(nums[i], i);
        }

        return new int[] {}; // if no pair found
    }
        
    
    
}