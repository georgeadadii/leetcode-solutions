// Two Sum: Java Implementation

// Difficulty: Easy

// Link: https://leetcode.com/problems/two-sum/

// Code:

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (numMap.containsKey(remainder)) {
                return new int[]{numMap.get(remainder), i};
            }
            numMap.put(nums[i], i);
        }
        return output;
    }
}