class Solution {
    public boolean isPalindrome(String s) {
        String k = s.toLowerCase();
        int left= 0;
        int right = k.length()-1;
        while(left<right){
            if (!Character.isLetterOrDigit(k.charAt(left))) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(k.charAt(right))) {
                right--;
            }
            else{
                if(k.charAt(left) != k.charAt(right)){
                return false;
            }
            
            left++;
            right--;
            }
        }
        return true;
    }
}