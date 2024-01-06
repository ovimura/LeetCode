package FindPivotIndex;

public class Solution {
    public int pivotIndex(int[] nums) {
        int i = -1;
        for(int j=0; j<nums.length; j++) {
            int left_sum = 0;
            for(int jl = 0; jl<j; jl++) {
                left_sum += nums[jl];
            }
            int right_sum = 0;
            for(int jr = j+1; jr<nums.length; jr++) {
                right_sum += nums[jr];
            }
            if(left_sum == right_sum) {
                i = j;
                break;
            }
        }
        return i;
    }
}
