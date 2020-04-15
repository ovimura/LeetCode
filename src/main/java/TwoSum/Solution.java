package TwoSum;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum;
        int a = 0, b = 0;
        for(int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                sum = nums[i]+nums[j];
                if(sum == target) {
                    a = i;
                    b = j;
                    break;
                }
            }
        }
        return new int[]{a, b};
    }
}
