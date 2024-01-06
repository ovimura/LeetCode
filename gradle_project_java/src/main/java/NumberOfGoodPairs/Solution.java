package NumberOfGoodPairs;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int numIdenticalPairs(int[] nums) {
        List<Integer[]> pairs = new ArrayList<>();
        for(int i=0; i<nums.length-1; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j]) {
                    pairs.add(new Integer[]{i, j});
                }
            }
        }
        return pairs.size();
    }
}
