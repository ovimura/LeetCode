package KthMissingPositiveNumber;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int[] temp = new int[10001];
        for(int a: arr) {
            temp[a]++;
        }
        for(int j=1; j<temp.length; j++) {
            if(temp[j]==0)
                i++;
            if(i == k)
                return j;
        }
        return 0;
    }
}
