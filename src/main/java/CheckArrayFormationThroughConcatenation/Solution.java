package CheckArrayFormationThroughConcatenation;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        List<Integer> ints = new ArrayList<>();
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<pieces.length; j++) {
                if(arr[i] == pieces[j][0]) {
                    for(int k=0; k<pieces[j].length; k++) {
                        ints.add(pieces[j][k]);
                    }
                }
            }
        }
        if (ints.size() != arr.length)
            return false;
        boolean result = true;
        for(int a=0; a<ints.size(); a++) {
            if(arr[a] != ints.get(a))
                result = false;
        }
        return result;
    }
}
