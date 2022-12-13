package MeanOfArrayAfterRemovingSomeElements;

import java.util.Arrays;

public class Solution {
    public double trimMean(int[] arr) {
        int fp = (int)(arr.length * 0.05);
        Arrays.sort(arr);
        for(int i=0; i<fp; i++) {
            arr[i] = 0;
            arr[arr.length-1-i] = 0;
        }
        int sum = 0;
        int count = arr.length- 2*fp;
        for(int j=0; j<arr.length; j++) {
            sum += arr[j];
        }
        return (double) sum/count;
    }
}
