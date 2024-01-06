package FindMaxConsecutiveOnes;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ones = 0;
        int temp = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1) {
                temp++;
            } else if (nums[i]==0) {
                if(temp>ones)
                    ones = temp;
                temp = 0;
            }
        }
        if(temp>ones)
            return temp;
        return ones;
    }
}
