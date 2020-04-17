package DuplicateZeros;

public class Solution {
    public void duplicateZeros(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0)
                count++;
        }
        int[] tmp = new int[arr.length+count];
        int j = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                j++;
                tmp[i+j-1] = 0;
                tmp[i+j] = 0;
            } else {
                tmp[i+j] = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++) {
            arr[i] = tmp[i];
        }
    }
}
