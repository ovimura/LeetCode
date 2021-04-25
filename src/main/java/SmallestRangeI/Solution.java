package SmallestRangeI;

import java.util.Arrays;

public class Solution {
    public int smallestRangeI(int[] A, int K) {
        int diff = 0;
        int left=Integer.MAX_VALUE, right = Integer.MIN_VALUE;
        for(int x: A) {
            if(left>x)
                left = x;
            if(right<x)
                right = x;
        }
        left = left+K;
        right = right-K;
        diff = Math.abs(right - left);
        if(left >= right) {
            diff = 0;
        } else if(left<right) {
            diff = Math.abs(right-left);
        }
        return diff;
    }

    public int smallestRangeI_sol1(int[] A, int K) {
        int diff = 0;
        int left=0, right = 0;
        Arrays.sort(A);
        left = A[0]+K;
        right = A[A.length-1]-K;
        diff = Math.abs(right - left);
        if(left >= right) {
            diff = 0;
        } else if(left<right) {
            diff = Math.abs(right-left);
        }
        return diff;
    }
}
