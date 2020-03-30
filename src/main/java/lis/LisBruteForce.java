package lis;

/*
* Given an unsorted array of integers, find the length of longest increasing subsequence.
* Example:
* Input: [10,9,2,5,3,7,101,18]
* Output: 4
* Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
*
* Note:
    There may be more than one LIS combination, it is only necessary for you to return the length.
    Your algorithm should run in O(n2) complexity.

* Follow up: Could you improve it to O(n log n) time complexity?
* */
// https://leetcode.com/articles/longest-increasing-subsequence/#
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
