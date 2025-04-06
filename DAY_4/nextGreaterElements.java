//leetcode 503

import java.util.Stack;

public class nextGreaterElements {
    public static void main(String[] args) {
        int[] temperatures = { 1, 2, 3, 4, 3 };
        int[] result = nextGreaterElementss(temperatures);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] nextGreaterElementss(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            ans[i] = -1;
        }

        for (int i = 0; i < 2 * n; i++) {
            int curr = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < curr) {
                ans[stack.pop()] = curr;
            }
            if (i < n) {
                stack.push(i);
            }
        }

        return ans;
    }
}