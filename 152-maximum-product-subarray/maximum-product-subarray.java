class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int[] p = new int[n];
        int[] s = new int[n];
        int max = Integer.MIN_VALUE;
        int pro = 1;
        for(int i = 0 ;i<n ;i++){
            pro = pro*nums[i];
            p[i] = pro ;
            if(pro==0) pro = 1;

        }
        pro = 1;
        for(int i =n-1 ;i>= 0 ;i--){
            pro = pro*nums[i];;
             s[i] = pro;
            if(pro==0) pro = 1;

        }
        for(int i = 0 ;i<n ;i++){
            max = Math.max(max,Math.max(p[i],s[i]));
        }
        return max;
    }
}