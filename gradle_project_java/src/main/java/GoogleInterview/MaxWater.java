package GoogleInterview;
// https://www.geeksforgeeks.org/trapping-rain-water/
public class MaxWater {
    public int maxWater(int[] arr) {
        int result = 0;
        for(int i=1; i<arr.length-1; i++) {
            int l = arr[i];
            for(int j=0; j<i; j++) {
                l = Math.max(l, arr[j]);
            }
            int r = arr[i];
            for(int j=i+1; j<arr.length; j++) {
                r = Math.max(r, arr[j]);
            }
            result += Math.min(l, r) - arr[i];
        }
        return result;
    }
}
