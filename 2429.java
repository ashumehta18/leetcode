https://leetcode.com/problems/minimize-xor/description/

public class Solution {
    public int minimizeXor(int num1, int num2) {
        int countBits1 = Integer.bitCount(num1);
        int countBits2 = Integer.bitCount(num2);
        int result = num1;

        if (countBits1 < countBits2) {
            int difference = countBits2 - countBits1;
            for (int i = 0; i < 32 && difference > 0; i++) {
                if ((result & (1 << i)) == 0) {
                    result |= (1 << i);
                    difference--;
                }
            }
        } else if (countBits1 > countBits2) {
            int difference = countBits1 - countBits2;
            for (int i = 0; i < 32 && difference > 0; i++) {
                if ((result & (1 << i)) != 0) {
                    result &= ~(1 << i);
                    difference--;
                }
            }
        }
        
        return result;
    }
}
