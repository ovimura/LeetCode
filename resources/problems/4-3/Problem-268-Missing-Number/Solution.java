public class Solution {
    public int missingNumber(int[] nums) {
        int total_with_missingNumber_included = (nums.length*(nums.length+1))/2;
        for(int i=0; i<nums.length; i++) {
            total_with_missingNumber_included -= nums[i];
        }
        return total_with_missingNumber_included;
    }
}