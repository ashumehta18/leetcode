https://leetcode.com/problems/find-peak-element/description/

class Solution {
    public int findPeakElement(int[] arr) {
        int max = arr[0];
            int index=0 ;
            for( int i = 0; i<arr.length;i++){
                if(arr[i]>max){
                    max= arr[i];
                   index = i;
                }
            }
            return index;
    }
}
