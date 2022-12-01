package PartitionArrayIntoThreePartsWithEqualSum;

public class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        int zeros = 0;
        for(int a: arr) {
            sum += a;
            if(a==0)
                zeros++;
        }
        if(zeros == arr.length)
            return true;
        if(sum % 3 != 0)
            return false;
        int p = sum/3;
        int t = 0;
        int parts_count = 0;
        for (int value : arr) {
            t += value;
            if (t == p) {
                t = 0;
                parts_count++;
            }
        }
        return parts_count >= 3;
    }
}
