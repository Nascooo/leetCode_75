package org.leetCode;

public class RunningSumOf1DProblem {
    public static void main(String[] args) {
        System.out.println(runningSum(new int[]{1, 2, 3, 4}));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        return nums;
    }
}