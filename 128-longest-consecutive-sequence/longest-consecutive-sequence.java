class Solution {
    public int longestConsecutive(int[] nums) {
       int n = nums.length;
       int longest = 1;

       if(n == 0) return 0;
       HashSet<Integer> set = new HashSet<>();

       for(int i=0;i<n;i++){
        set.add(nums[i]);
       }

       for (int num : set) {
         
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                longest= Math.max(longest, currentStreak);
            }
        }
        return longest;
    }
}