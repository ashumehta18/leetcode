class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0; // Initialized to 0, will be set in first iteration
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            // Fix: Standard addition/subtraction
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}