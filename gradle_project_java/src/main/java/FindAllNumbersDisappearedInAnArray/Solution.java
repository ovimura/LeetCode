package FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    // sol url: https://medium.com/@saurav.agg19/find-all-numbers-disappeared-in-an-array-c6a01393909
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> r = new ArrayList<>();

        for(int j=0; j<nums.length; j++) {
            int index = Math.abs(nums[j])-1;
            if(nums[index]>0)
                nums[index] = - nums[index];
        }
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0)
                r.add(i+1);
        }
        return r;
    }
}
