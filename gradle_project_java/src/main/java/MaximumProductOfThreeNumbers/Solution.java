package MaximumProductOfThreeNumbers;

import java.util.Arrays;

public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        if(nums.length == 3)
            return nums[0]*nums[1]*nums[2];
        return Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]);
    }
}
