package MakeTwoArraysEqualByReversingSubarrays;

public class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        for(int i=0; i<target.length; i++) {
            int sub = -1;
            for(int j=i; j<arr.length; j++) {
                if(arr[j] == target[i]) {
                    sub = j;
                    break;
                }
            }
            if(sub == -1)
                return false;
            int tmp = arr[sub];
            arr[sub] = arr[i];
            arr[i] = tmp;
        }
        for(int k=0; k<target.length; k++) {
            if(target[k] != arr[k])
                return false;
        }
        return true;
    }
}
