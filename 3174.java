https://leetcode.com/problems/clear-digits/submissions/1537617855/?envType=daily-question&envId=2025-02-10


class Solution {
    public String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        while (true) {
            boolean foundDigit = false;
            
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    foundDigit = true;
                    
                    // Find the closest non-digit character to the left
                    int leftIndex = i - 1;
                    while (leftIndex >= 0 && Character.isDigit(sb.charAt(leftIndex))) {
                        leftIndex--;
                    }
                    
                    // Remove the digit and the closest non-digit character to its left
                    if (leftIndex >= 0) {
                        sb.deleteCharAt(leftIndex);
                        sb.deleteCharAt(leftIndex);
                    } else {
                        sb.deleteCharAt(i);
                    }
                    
                    break;
                }
            }
            
            if (!foundDigit) {
                break;
            }
        }
        
        return sb.toString();
    }
}
