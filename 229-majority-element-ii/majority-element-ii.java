class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        

       // for(int i = 0 ;i<nums.length ;i++){
            if(map.get(nums[i]) > (nums.length/3)){
                list.add(nums[i]);
            }
        }
        return new ArrayList<> (list);
    }
}