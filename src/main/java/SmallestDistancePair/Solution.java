package SmallestDistancePair;

import java.util.Arrays;

public class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0, h = nums[nums.length-1] - nums[0];
        while(l<h) {
            int m = l+((h-l) >> 1);
            if(paris(nums, m) >= k) {
                h = m;
            } else {
                l = m+1;
            }
        }
        return l;
    }

    int paris(int[]nums, int m) {
        int cnt = 0;
        for(int i = 0, j=1; i<nums.length-1; i++) {
            while(j<nums.length && nums[j]-nums[i] <= m) {
                j++;
            }
            cnt += j-i-1;
        }
        return cnt;
    }
}
