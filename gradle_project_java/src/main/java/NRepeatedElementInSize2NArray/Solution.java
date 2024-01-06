package NRepeatedElementInSize2NArray;

public class Solution {
    public int repeatedNTimes(int[] A) {
        int a[] = new int[10000];
        for(int i=0; i<A.length; i++) {
            if(a[A[i]] == 1)
                return A[i];
            else
                a[A[i]]++;
        }
        return 0;
    }
}