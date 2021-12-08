package SummaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rs = new ArrayList<>();
        int start;
        if(nums.length == 0)
            return rs;
        else if(nums.length == 1) {
            rs.add(""+nums[0]);
            return rs;
        }
        start = nums[0];
        for(int i=0; i<nums.length-1; i++) {
            if(i>0 && nums[i-1] != nums[i]-1)
                start = nums[i];
            if(nums[i+1] == nums[i]+1 && (nums.length-1) == i+1) {
                rs.add(start+"->"+nums[i+1]);
            } else if(nums[i+1] == nums[i]+1) {
                continue;
            } else if(start == nums[i]) {
                rs.add(""+start);
            } else {
                rs.add(start+"->"+nums[i]);
            }
            if((i+1) == (nums.length-1) && nums[i]+1 != nums[i+1])
                rs.add(""+nums[i+1]);
        }
        return rs;
    }
}
