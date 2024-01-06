package SortArrayByParity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public int[] sortArrayByParity(int[] A) {
        List<Integer> res = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for(int i=0; i<A.length; i++) {
            if(A[i] %2 == 0)
                even.add(A[i]);
            else
                odd.add(A[i]);
        }
        even.forEach(n -> {
            res.add(n);
        });
        odd.forEach(n -> {
            res.add(n);
        });
        return  Arrays.stream(res.toArray()).mapToInt(o -> (int)o).toArray();
    }
}
