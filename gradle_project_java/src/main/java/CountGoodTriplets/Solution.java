package CountGoodTriplets;

public class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int count = 0;
        for(int i=0; i<arr.length-2; i++) {
            for(int j=i+1; j<arr.length-1; j++) {
                for(int k=j+1; k<arr.length; k++) {
                    int t1 = Math.abs(arr[i]-arr[j]);
                    int t2 = Math.abs(arr[j]-arr[k]);
                    int t3 = Math.abs(arr[i]-arr[k]);
                    if(t1 <= a && t2 <= b && t3 <= c)
                        count++;
                }
            }
        }
        return count;
    }
}
