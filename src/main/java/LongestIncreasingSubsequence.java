/* Author: Ovidiu Mura
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
// https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
public class LongestIncreasingSubsequence {
    int max_ref = 0;

    int LIS(int nums[], int n)
    {
        if (n == 1)
            return 1;
        int res, max_final = 1;
        for (int i = 1; i < n; i++)
        {
            res = LIS(nums, i);
            if (nums[i-1] < nums[n-1] && res + 1 > max_final)
                max_final = res + 1;
        }
        if (max_ref < max_final)
            max_ref = max_final;
        return max_final;
    }

    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        max_ref = 1;

        // The function _lis() stores its result in max
        LIS(nums, n);

        // returns max
        return max_ref;
    }
}
