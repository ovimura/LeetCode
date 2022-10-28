package SetMismatch;

import java.util.Arrays;

public class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int t = 0;
        int[] r = new int[2];
        for(int i=0; i<nums.length; i++) {
            if(t == nums[i]) {
                r[0] = t;
                break;
            }
            t = nums[i];
        }
        int tot = nums.length * (nums.length + 1) / 2;
        int totp = 0;
        for(int a: nums)
            totp += a;
        totp -= r[0];
        r[1] = tot-totp;
        return r;
    }
}
