package LargestPerimeterTriangle;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i=nums.length-1; i >=2; i--) {
            int a = nums[i-1] + nums[i-2];
            if(a > nums[i])
                return a + nums[i];
        }
        return 0;
    }
}
