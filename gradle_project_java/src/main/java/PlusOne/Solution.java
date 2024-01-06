package PlusOne;

import java.util.*;

public class Solution {

    public int[] plusOne(int[] digits) {
        List<Integer> l = new ArrayList<>();
        for(int d: digits) {
            l.add(d);
        }
        int tail = l.size()-1;
        if(l.get(tail)<9) {
            int temp = l.get(tail)+1;
            l.remove(tail);
            l.add(temp);
        } else {
            int i=tail;
            while(i>=0 && l.get(i)==9) {
                l.remove(i);
                l.add(0);
                i--;
            }
            if(i<0)
                l.add(0, 1);
            else {
                int temp = l.get(i)+1;
                l.remove(i);
                l.add(i, temp);
            }

        }
        int[] r = new int[l.size()];
        for(int i=0; i<l.size(); i++) {
            r[i] = l.get(i);
        }
        return r;
    }

    public int[] plusOne_overflow(int[] digits) {
        List<Integer> rs = new ArrayList<>();
        int val = digits[0];
        for(int k=1; k<digits.length; k++) {
            System.out.print(digits[k] + ": ");
            val = val * 10 + digits[k];
            System.out.println(val);
        }
        val++;
        System.out.println(val);
        while(val != 0) {
            int r = val % 10;
            rs.add(r);
            val = (val - r)/10;
        }
        Collections.reverse(rs);
        Integer [] result = new Integer[rs.size()];
        result = rs.toArray(result);
        int [] temp = new int[result.length];
        for(int i=0; i<result.length; i++) {
            temp[i] = result[i].intValue();
        }
        return temp;
    }
}
