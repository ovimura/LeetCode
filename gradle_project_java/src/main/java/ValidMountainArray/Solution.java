package ValidMountainArray;

public class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        if(arr.length == 3) {
            if(arr[0]<arr[1] && arr[1] > arr[2])
                return true;
            else
                return false;
        }
        int pick = -1, max_val = -1;
        for(int j=0; j<arr.length; j++) {
            if(arr[j] > max_val) {
                max_val = arr[j];
                pick = j;
            }
        }
        if(pick==0 || pick+1 == arr.length)
            return false;
        for(int i=1; i<pick; i++) {
            if(arr[i-1]>=arr[i])
                return false;
        }
        for(int i=pick+1; i<arr.length; i++) {
            if(arr[i-1]<=arr[i])
                return false;
        }
        return true;
    }
}
