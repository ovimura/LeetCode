package LargestNumberAtLeastTwiceOfOthers;

import java.util.Arrays;

public class Solution {
    public int dominantIndex(int[] nums) {
        int i=-1;
        int largest = -1;
        for(int n = 0; n<nums.length; n++) {
            if(nums[n]>largest)
                largest = nums[n];
        }
        for(int j=0; j<nums.length; j++) {
            if(nums[j] == largest)
                i = j;
            if(nums[j] != largest && nums[j]*2 > largest) {
                i = -1;
                break;
            }
        }
        return i;
    }

    public int dominantIndex_orig(int[] nums) {
        int i=-1, n=0;
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int largest = copy[copy.length-1];
        for(int j=0; j<nums.length; j++) {
            if(nums[j] == largest)
                i = j;
            if(nums[j] != largest && nums[j]*2 > largest) {
                i = -1;
                break;
            }
        }
        return i;
    }
}
