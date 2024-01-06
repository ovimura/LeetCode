package SelfDividingNumbers;

import ConvertBinaryNumberInALinkedListToInteger.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for(int k=left; k<=right; k++) {
            String n = Integer.toString(k);
            boolean flg = false;
            for (int i = 0; i < n.length(); i++) {
                if (Character.getNumericValue(n.charAt(i)) == 0) {
                    flg = true;
                    break;
                }
                if(k % Character.getNumericValue(n.charAt(i)) != 0) {
                    flg = true;
                }
            }
            if(flg == false)
                result.add(k);
        }
        return result;
    }
}
