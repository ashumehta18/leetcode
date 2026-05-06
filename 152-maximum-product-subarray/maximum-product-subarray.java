class Solution {
    public int maxProduct(int[] nums) {
        //prefix
        //suffix create
        int n  = nums.length; 
        int[] p = new int[n];
        int[] s = new int[n];
        int pro =1;
        int max = Integer.MIN_VALUE;

        for(int i = 0 ;i<n ;i++){
           
            pro *= nums[i];
            p[i] = pro;
            if (pro == 0) pro = 1;
        }
pro =1;
        for(int i = n-1 ;i>=0;i--){
           
            pro *=nums[i];
             s[i] = pro;
            if (pro == 0) pro = 1;
        }
         for(int i = 0 ;i<n;i++){
            max =Math.max(max, Math.max(p[i],s[i]));
         }
return max;
    }
}