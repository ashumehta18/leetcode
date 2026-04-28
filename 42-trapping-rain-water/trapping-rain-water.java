class Solution {
    public int trap(int[] arr) {
        int max = 0 , lmax = 0, rmax = 0 , l = 0;
        int r= arr.length-1;

        while(l<r){
            if(arr[l]<=arr[r]){
                if(lmax>=arr[l]){
                    max += lmax - arr[l];
                    
                }else{
                    lmax = arr[l];
                }
                l++;
            }else{
                if(rmax>arr[r]){
                    max += rmax-arr[r];
                    
                }else{
                    rmax = arr[r];
                }
                r--;
            }
        }
        return max;
    }
}