package HowManyNumbersAreSmallerThanTheCurrentNumber;

import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            for(int j=0; j<nums.length; j++) {
                if(nums[j] < nums[i]) {
                    result[i] += 1;
                }
            }
        }
        return result;
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++)
            if(nums[i]>max)
                max = nums[i];
        int[] result = new int[max+1];
        for(int i=0; i<nums.length; i++)
            result[nums[i]]++;
        for(int i=1; i<result.length; i++) {
            result[i] += result[i-1];
        }
        int[] temp = new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            temp[i] = result[nums[i]-1];
        }
        return temp;
    }
}
