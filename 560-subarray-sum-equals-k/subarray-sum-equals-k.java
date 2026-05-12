class Solution {
    public int subarraySum(int[] nums, int target) {
        int count = 0;
        int curr_sum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);
        for(int i = 0 ;i<nums.length;i++){
            curr_sum +=nums[i];
            
            if(map.containsKey(curr_sum-target)){
                count +=map.get(curr_sum-target);
            }
             map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
       }
       return count;
    }
}