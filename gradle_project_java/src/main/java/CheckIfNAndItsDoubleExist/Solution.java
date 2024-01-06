package CheckIfNAndItsDoubleExist;

import java.util.Arrays;

public class Solution {
    public boolean checkIfExist(int[] arr) {
        if(arr.length == 0)
            return false;
        Arrays.sort(arr);
        int j = 0;
        int i = arr.length-1;
        while(i>=0) {
            j = 0;
            while((j < arr.length)) {
                if(arr[i] == (2 * arr[j]) && (i != j))
                    return true;
                j++;
            }
            i--;
        }
        return false;
    }
}
