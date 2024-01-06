package RelativeSortArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length];
        List<Integer> tmp = new ArrayList<>();
        int k = 0;
        for(int i=0; i<arr2.length; i++) {
            for(int j=0; j<arr1.length; j++) {
                if(arr2[i] == arr1[j]) {
                    result[k++] = arr1[j];
                    arr1[j] = -1;
                }
            }
        }
        for(int it: arr1) {
            if(it >= 0)
                tmp.add(it);
        }
        Collections.sort(tmp);
        while(k<result.length && tmp.size() > 0)
            result[k++] = tmp.remove(0);
        return result;
    }
}
