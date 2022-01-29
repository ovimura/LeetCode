package ThirdMaximumNumber;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s = new TreeSet<Integer>();
        for(int i: nums)
            s.add(i);
        Integer[] a = s.toArray(new Integer[]{});
        if(a.length>=3)
            return a[a.length-3];
        else
            return a[a.length-1];
    }
}
