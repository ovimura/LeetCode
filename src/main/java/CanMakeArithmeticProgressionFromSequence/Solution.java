package CanMakeArithmeticProgressionFromSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length == 2)
            return true;
        Arrays.sort(arr);
        List<Integer> ints = new ArrayList<>();
        for(int i=0; i<arr.length-1; i++) {
            ints.add(Math.abs(arr[i] - arr[i+1]));
        }
        int diff = ints.get(0);
        for(int j=0; j<ints.size(); j++) {
            if(ints.get(j) != diff)
                return false;
        }
        return true;
    }
}
