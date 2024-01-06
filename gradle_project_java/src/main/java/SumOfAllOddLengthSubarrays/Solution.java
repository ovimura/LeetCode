package SumOfAllOddLengthSubarrays;

// Ref: https://github.com/doocs/leetcode/blob/main//solution/1500-1599/1588.Sum%20of%20All%20Odd%20Length%20Subarrays/README_EN.md
public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int[] temp = new int[arr.length+1];
        for(int i=0; i<arr.length; i++) {
            temp[i+1] = temp[i] + arr[i];
        }
        int r = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; i+j<arr.length; j+=2) {
                r += temp[i+j+1] - temp[i];
            }
        }
        return r;
    }
}
