package BinaryGap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int binaryGap(int n) {
        int zeros = 0;
        List<Integer> gaps = new ArrayList<>();
        int ones = 0;
        while(n > 0) {
            if((n & 1) == 1) {
                if(ones>0) {
                    gaps.add(zeros);
                    ones = 0;
                }
                ones++;
                zeros = 0;
            } else {
                zeros++;
            }
            n = n >> 1;
        }
        Collections.sort(gaps);
        if(gaps.size()== 0)
            return 0;
        else
            return gaps.get(gaps.size()-1)+1;
    }
}
