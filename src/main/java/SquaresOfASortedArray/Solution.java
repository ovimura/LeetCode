package SquaresOfASortedArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] sortedSquares(int[] A) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            list.add((Integer) A[i]*A[i]);
        }
        Integer[] a = list.toArray(new Integer[]{});
        Arrays.sort(a);
        return Arrays.stream(a).mapToInt(Integer::intValue).toArray();
    }

    public int[] sortedSquares1(int[] A) {
        int[] a = new int[A.length];
        for(int i=0; i<A.length; i++) {
            a[i] =A[i]*A[i];
        }
        Arrays.sort(a);
        return a;
    }
}
