package FindTheDifferenceOfTwoArrays;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> answer = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        int[] vals = new int[2003];
        int[] vals2 = new int[2003];
        for(int i=0; i<nums1.length; i++)
        {
            if(nums1[i]<0)
                vals[-1*nums1[i] + 1000]++;
            else
                vals[nums1[i]]++;
        }
        for(int i=0; i<nums2.length; i++)
        {
            if(nums2[i]<0)
                vals2[-1*nums2[i] + 1000]++;
            else
                vals2[nums2[i]]++;
        }
        for(int i1=0; i1<nums1.length; i1++) {
            if(nums1[i1] < 0 && vals[-1*nums1[i1] + 1000] > 0 && vals2[-1*nums1[i1] + 1000] == 0) {
                s1.add(nums1[i1]);
            } else if(nums1[i1] >= 0 && vals[nums1[i1]] > 0 && vals2[nums1[i1]] == 0) {
                s1.add(nums1[i1]);
            }
        }
        for(int i2=0; i2<nums2.length; i2++) {
            if(nums2[i2] < 0 && vals2[-1*nums2[i2] + 1000] > 0 && vals[-1*nums2[i2] + 1000] == 0) {
                s2.add(nums2[i2]);
            } else if(nums2[i2] >= 0 && vals2[nums2[i2]] > 0 && vals[nums2[i2]] == 0) {
                s2.add(nums2[i2]);
            }
        }
        answer.add(new ArrayList<>(s1));
        answer.add(new ArrayList<>(s2));
        return answer;
    }
}
