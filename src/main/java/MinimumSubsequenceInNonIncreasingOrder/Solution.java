package MinimumSubsequenceInNonIncreasingOrder;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[] insertionSort(int[] nums) {
        int v=Integer.MIN_VALUE;
        int j=0;
        for(int i=0; i<nums.length; i++) {
            v = nums[i];
            j = i-1;
            while(j>=0 && nums[j]>v) {
                nums[j+1] = nums[j];
                j = j-1;
            }
            nums[j+1] = v;
        }
        return nums;
    }

    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> sum= new ArrayList<>();
        int total = 0, temp = 0;
        int[] t = insertionSort(nums);
        for(int i=0; i<nums.length; i++) {
            total += nums[i];
        }
        for (int a=t.length-1; a>=0; a--) {
            temp += nums[a];
            if(temp > (total-temp)) {
                sum.add(nums[a]);
                break;
            } else {
                sum.add(nums[a]);
            }
        }
        return sum;
    }
}
