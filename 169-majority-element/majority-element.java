class Solution {
    public int majorityElement(int[] nums) {
        int can = nums[0];
        int n = nums.length;
        int count =0;
        for(int i =0;i<n;i++ ){
             
            
            if(count ==0) can = nums[i];
            if(nums[i] == can){
                count++;
            }else{
                count--;
            }
           
        }
        return can;
    }
}