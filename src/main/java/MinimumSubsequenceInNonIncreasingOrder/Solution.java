package MinimumSubsequenceInNonIncreasingOrder;

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
        int[] t = insertionSort(nums);
        for (int a: t) {
            System.out.println(a);
        }
        return null;
    }
}
