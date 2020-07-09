package CreateTargetArrayInTheGivenOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] result = new int[nums.length];
        Arrays.fill(result, -1);
        List<Integer> it;
        for(int i=0; i<nums.length; i++) {
            int idx = index[i];
            it = new ArrayList<>();
            if(result[idx] != -1) {
                for (int j = idx; j < nums.length; j++) {
                    it.add(result[j]);
                }
            }
            result[index[i]] = nums[i];
            idx++;
            if(idx == nums.length)
                break;
            if(it.size()>0) {
                for (int j = 0; idx < nums.length; j++) {
                    result[idx] = it.get(j);
                    idx++;
                }
            }
            it.clear();
        }
        return result;
    }
}
