class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n = nums.length;
        for(int i = 0 ;i<n;i++){
        if(map.get(nums[i])>n/3)
        set.add(nums[i]);
        }
        return new ArrayList<>(set);
    }
}