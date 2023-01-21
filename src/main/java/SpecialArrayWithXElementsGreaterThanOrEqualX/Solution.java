package SpecialArrayWithXElementsGreaterThanOrEqualX;

import java.util.Arrays;

public class Solution {
    public int specialArray(int[] nums) {
        int r = 1;
        Arrays.sort(nums);
        if(nums.length == 0)
            return 0;
        for(int i=0; i<nums.length; i++) {
            r = 1;
            while(r<= nums[i] && r<=nums.length-i) {
                if (r <= nums[i] && r == nums.length - i) {
                    if(i>0 && r>nums[i-1])
                        return r;
                    else if(i==0)
                        return r;

                }
                r++;
            }
        }
        return -1;
    }
}
