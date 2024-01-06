package SortArrayByParityII;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int [] result = new int[A.length];
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for(int i: A) {
            if(i % 2 == 0)
                evens.add(i);
            else
                odds.add(i);
        }
        for(int j=0; j<A.length; j++) {
            if(j % 2 == 0)
                result[j] = evens.remove(0);
            else
                result[j] = odds.remove(0);
        }
        return result;
    }
}
