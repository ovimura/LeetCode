package BinaryPrefixDivisibleByFive;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> r = new ArrayList<>();
        for(int i=1; i<nums.length; i++) {
            nums[i] += nums[i-1]*2 %5;
        }
        for(int j=0; j<nums.length; j++) {
            r.add(nums[j] % 5 == 0);
        }
        return r;
    }
}
