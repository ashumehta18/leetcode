class Solution {
    public int trap(int[] height) {
        //max array - left
        //max array - right 
        //height = min(left, max) -height at i;
        //add all the height will sum upto result
        int res = 0;
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        int max = 0;
        for(int i = 0 ;i<n ;i++){
            max = Math.max(max,height[i]);
            left[i] = max;
        }
        int maxr = 0;
        for(int i = n-1;i>=0;i--){
            maxr= Math.max(maxr,height[i]);
            right[i] = maxr;
        }
        for(int i = 0 ;i<n ;i++){
            height[i] = Math.min(left[i],right[i]) -height[i];
            res+=height[i];
        }

        return res ;

    }
}