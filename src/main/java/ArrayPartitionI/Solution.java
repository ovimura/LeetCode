package ArrayPartitionI;

import java.lang.Math;
import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        int [] sorted = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int min = 100000;
            int idx = -1;
            for(int j=0; j<nums.length; j++) {
                if(nums[j] < min) {
                    min = nums[j];
                    idx = j;
                }
            }
            nums[idx] = 100000;
            sorted[i] = min;
        }
        for(int i=0; i<sorted.length-1; i+=2) {
            sum += Math.min(sorted[i], sorted[i+1]);
        }
        return sum;
    }
}
