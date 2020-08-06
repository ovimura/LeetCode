package FindNUniqueIntegersSumUpToZero;

public class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        int mid = n/2;
        int m = n%2;
        if(m == 0) {
            int val = -mid;
            for(int i=0; i<mid; i++) {
                arr[i] = val;
                val++;
            }
            val = 1;
            for(int i=mid; i<n; i++) {
                arr[i] = val;
                val++;
            }
        } else {
            int val = -mid;
            for(int i=0; i<mid; i++) {
                arr[i] = val;
                val++;
            }
            arr[mid] = 0;
            val = 1;
            for(int i=mid+1; i<n; i++) {
                arr[i] = val;
                val++;
            }
        }
        return arr;
    }
}
