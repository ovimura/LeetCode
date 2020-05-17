package Lis;

import java.util.Arrays;


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
* https://leetcode.com/articles/longest-increasing-subsequence/#
* */

public class LisRecursionWithMemoization {

    public int lengthOfLIS(int[] nums) {
        int memo[][] = new int[nums.length][nums.length];
        for (int[] l : memo) {
            Arrays.fill(l, -1);
        }
        int ii= 0;
        for(int i=0; i<memo.length; i++)
            for(int j=0; j<memo[i].length; j++) {
                ii++;
            }
        return lengthofLIS(nums, -1, 0, memo);
    }

    public int lengthofLIS(int[] nums, int previndex, int curpos, int[][] memo) {
        if (curpos == nums.length) {
            return 0;
        }
        if (memo[previndex + 1][curpos] >= 0) {
            return memo[previndex + 1][curpos];
        }
        int taken = 0;
        if (previndex < 0 || nums[curpos] > nums[previndex]) {
            taken = 1 + lengthofLIS(nums, curpos, curpos + 1, memo);
        }

        int nottaken = lengthofLIS(nums, previndex, curpos + 1, memo);
        memo[previndex + 1][curpos] = Math.max(taken, nottaken);
        return memo[previndex + 1][curpos];
    }
}
