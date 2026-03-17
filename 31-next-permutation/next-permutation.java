class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length -2;
        while(i>=0 && nums[i]>= nums[i+1]){
            i--;
        } // if not found decrement by 1 i each time 
        if(i>=0){
            int j = nums.length -1;
            while(nums[j]<=nums[i]){ //check for the other no. with which swap need to be encountred
                j--;
            }
            swap(nums,i,j); // swap both no.s 
        }
        
        reverse(nums,i+1,nums.length -1); // reverse as back from is sorted in asc to desc
    }
    public void swap(int[] arr,int left, int right){
        if(left == right) return;
        arr[left] = arr[left]^arr[right];
        arr[right] = arr[right]^arr[left];
         arr[left] = arr[left]^arr[right];

    }
    public void reverse(int[] arr,int left,int right){
    //right = arr.length -1;
    while(left<right){
        swap(arr,left,right);
         left++;
         right--;
    }
    }
}