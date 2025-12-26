https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/

class Solution {
    public int maxFrequency(int[] nums, int k) {
        // Step 1: Sort array
        Arrays.sort(nums);

        int left = 0;
        long sum = 0;      // use long to avoid overflow
        int maxFreq = 0;

        // Step 2: Sliding window
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Step 3: Check if window is valid
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }

            // Step 4: Update answer
            maxFreq = Math.max(maxFreq, right - left + 1);
        }

        return maxFreq;
    }
}
