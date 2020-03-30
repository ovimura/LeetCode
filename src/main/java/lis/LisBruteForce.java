package lis;

public class LisBruteForce {

    /*
    * Complexity Analysis

        Time complexity : O(2^n). Size of recursion tree will be 2^n.

        Space complexity : O(n^2). memo array of size n∗n is used.
    * */
    public int lengthOfLIS(int[] nums) {
        return lengthofLIS(nums, Integer.MIN_VALUE, 0);
    }

    public int lengthofLIS(int[] nums, int prev, int curpos) {
        if (curpos == nums.length) {
            return 0;
        }
        int taken = 0;
        if (nums[curpos] > prev) {
            taken = 1 + lengthofLIS(nums, nums[curpos], curpos + 1);
        }
        int nottaken = lengthofLIS(nums, prev, curpos + 1);
        return Math.max(taken, nottaken);
    }
}
