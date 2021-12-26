package IntersectionOfTwoArraysII;

import java.util.*;

public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> r = new ArrayList<>();
        Map<Integer, List<Integer>> n1 = new HashMap<>();
        Map<Integer, List<Integer>> n2 = new HashMap<>();
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    List<Integer> li = n1.get(nums1[i]);
                    if(li != null && !li.contains(i)) {
                        li.add(i);
                        n1.put(nums1[i], li);
                    } else if(li == null) {
                        li = new ArrayList<>();
                        li.add(i);
                        n1.put(nums1[i], li);
                    }
                    li = n2.get(nums2[j]);
                    if(li != null && !li.contains(j)) {
                        li.add(j);
                        n2.put(nums2[j], li);
                    } else if(li == null) {
                        li = new ArrayList<>();
                        li.add(j);
                        n2.put(nums2[j], li);
                    }
                }
            }
        }
        for(int i: n1.keySet()) {
            List<Integer> v = n1.get(i);
            if(v.size() == n2.get(i).size()) {
                for(int k=0; k<v.size(); k++)
                    r.add(i);
            } else {
                int min = Math.min(v.size(), n2.get(i).size());
                for(int k=0; k<min; k++)
                    r.add(i);
            }
        }
        int[] t = new int[r.size()];
        for(int i=0; i<r.size(); i++) {
            t[i] = r.get(i);
        }
        return t;
    }


    public int[] intersect0(int[] nums1, int[] nums2) {


        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return new int[0];
        }

        int i = 0;
        int j = 0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> result = new ArrayList<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]){
                i++;
            } else {
                j++;
            }
        }

        // Convert list to array
        return listToArray(result);
    }

    private int[] listToArray(List<Integer> list) {
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
