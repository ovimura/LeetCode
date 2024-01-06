package LongestContinuousIncreasingSubsequence;

import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length == 1)
            return 1;
        SortedSet<Integer> len = new TreeSet<>();
        int count = 1;
        for(int i=1; i<nums.length; i++) {
            if(nums[i]>nums[i-1]) {
                count++;
            }
            if(nums[i]<=nums[i-1] || i == nums.length-1){
                len.add(count);
                count = 1;
            }
        }
        return len.last();
    }
}
