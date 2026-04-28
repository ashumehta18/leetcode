class Solution {
    public int trap(int[] arr) {
        int max = 0 , lmax = 0, rmax = 0 , l = 0;
        int r= arr.length-1;

        while(l<r){ //left part less thna right 

            if(arr[l]<=arr[r]){ //values left are less
                if(lmax>=arr[l]){ //left max is greater than curr
                    max += lmax - arr[l];
                }else{
                    lmax = arr[l];
                }
                l++;
            }else{  //values at right are less
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