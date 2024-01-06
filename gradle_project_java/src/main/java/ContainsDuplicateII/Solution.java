package ContainsDuplicateII;

import java.util.*;

public class Solution {
    public boolean containsNearbyDuplicate0(int[] nums, int k) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] == nums[j] && (Math.abs(i-j)<=k))
                    return true;
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> m = new HashMap<>();

        for(int i =0 ; i<nums.length; i++) {
            if(!m.keySet().contains(nums[i])) {
                List<Integer> temp = new ArrayList<>();
                temp.add(i);
                m.put(nums[i], temp);
            } else {
                List<Integer> val = m.get(nums[i]);
                for(Integer v: val) {
                    if(Math.abs(v - i) <= k)
                        return true;
                }
                val.add(i);
                m.put(nums[i], val);
            }
        }
        return false;
    }
}
