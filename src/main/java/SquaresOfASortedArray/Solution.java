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

    public int[] sortedSquares2(int[] A) {
        int[] a = new int[A.length];
        for(int i=0; i<A.length; i++) {
            a[i] =A[i]*A[i];
        }
        Arrays.sort(a);
        return a;
    }

    public int[] sortedSquares3(int[] A) {
        int N = A.length;
        int j=0;
        while (j<N && A[j] < 0) {
            j++;
        }
        int i = j-1;
        int[] ans = new int[N];
        int t = 0;
        while (i >= 0 && j < N) {
            if (A[i]*A[i] < A[j]*A[j]) {
                ans[t++] = A[i] * A[i];
                i--;
            } else {
                ans[t++] = A[j]*A[j];
                j++;
            }
        }
        while (i>=0) {
            ans[t++] = A[i]*A[i];
            i--;
        }
        while (j<N) {
            ans[t++] = A[j] * A[j];
            j++;
        }
        return ans;
    }
}
