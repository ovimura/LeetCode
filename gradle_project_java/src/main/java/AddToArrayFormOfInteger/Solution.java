package AddToArrayFormOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> r = new ArrayList<>();
        String sk = String.valueOf(k);
        int[] tmp = null;
        if(num.length<sk.length()) {
            tmp = new int[sk.length()];
            for(int i=tmp.length-1; i>=0; i--) {
                tmp[i] = 0;
            }
            int dif = tmp.length-num.length;
            for(int i=num.length-1; i>=0; i--) {
                tmp[dif+i] = num[i];
            }
            num = tmp;
        }
        int q = 0;
        for(int i=0; i<sk.length(); i++) {
            int t = sk.charAt(sk.length()-1-i)-'0';
            int v = num[num.length-1-i] + t + q;
            if(v>9) {
                q = (v-v%10)/10;
                r.add(0, v%10);
            } else {
                q = 0;
                r.add(0, v);
            }
        }
        for(int i=num.length-1-sk.length(); i>=0; i--) {
            int v = num[i]+q;
            if(v>9) {
                q = (v-v%10)/10;
                r.add(0, v%10);
            } else {
                q = 0;
                r.add(0,v);
            }
        }
        if(q>0)
            r.add(0,q);
        return r;
    }
}
