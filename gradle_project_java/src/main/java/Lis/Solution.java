package Lis;

public class Solution {
    public int findNumberOfLIS(int[] nums) {
        if(nums.length==1)
            return 1;
        else if(nums.length == 0)
            return 0;
        int i=0, j=0, max = 0;
        int[] temp = new int[nums.length];
        for(i=0; i<nums.length; i++)
            temp[i] = 1;
        for(i=0; i<nums.length; i++) {
            for(j=0; j<i; j++) {
                if(nums[i] > nums[j] && temp[i]<temp[j]+1)
                    temp[i] = temp[j]+1;
            }
        }
        for(i=0; i<temp.length; i++) {
            if(max<temp[i])
                max = temp[i];
        }
        return max;
    }
}
