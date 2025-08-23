https://leetcode.com/problems/asteroid-collision/solutions/7027049/asteroid-collision-stack-by-ashu_129-34ns/

import java.util.Stack;

public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int as : asteroids) {
            boolean alive = true;

            while (!stack.isEmpty() && as < 0 && stack.peek() > 0) {
                int top = stack.peek();

                if (top < -as) {
                    stack.pop();  
                } else if (top == -as) {
                    stack.pop();  
                    alive = false;
                    break;
                } else {
                    alive = false;
                    break;
                }
            }

            if (alive) {
                stack.push(as);
            }
        }

       
        int[] result = new int[stack.size()];
        for (int i = stack.size() - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }

        return result;
    }
}
