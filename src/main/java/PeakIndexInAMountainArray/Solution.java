package PeakIndexInAMountainArray;

public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int m = -1;
        int idx = -1;
        for(int i=0; i<arr.length; i++) {
            if(m < arr[i]) {
                m = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
