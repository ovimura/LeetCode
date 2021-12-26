package IntersectionOfTwoArrays;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> r = new HashSet<>();
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j])
                    r.add(nums1[i]);
            }
        }
        Integer[] t = r.toArray(new Integer[]{});
        int[] rr = new int[r.size()];
        for(int i=0; i<r.size(); i++) {
            rr[i] = t[i];
        }
        return rr;
    }
}
