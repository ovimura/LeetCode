package ContainsDuplicate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(count.containsKey(nums[i])) {
                Integer val = count.get(nums[i]);
                val++;
                count.put(nums[i], val);
            } else {
                count.put(nums[i], 1);
            }
        }
        for(int k: count.keySet()) {
            if(count.get(k)>1)
                return true;
        }
        return false;
    }
}
