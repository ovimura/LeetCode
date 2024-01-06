package MaximumSubarray;

public class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int next = 0;
        for(int i=0; i<nums.length; i++) {
            next += nums[i];
            if (max < next) {
                max = next;
            }
            if(next < 0) {
                next = 0;
            }
        }
        return max;
    }
}
