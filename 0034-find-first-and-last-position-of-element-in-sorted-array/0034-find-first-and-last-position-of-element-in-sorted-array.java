class Solution {
    public int[] searchRange(int[] nums, int target) {
        // Check for null or empty array
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }

        // Initialize the result array
        int[] result = new int[]{-1, -1};

        // Find the first and last positions of the target
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                // Set the first index if it's the first occurrence
                if (result[0] == -1) {
                    result[0] = i;
                }
                // Always update the last index
                result[1] = i;
            }
        }

        return result;
    }
}
