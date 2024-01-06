package ThousandSeparator;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String thousandSeparator(int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        List<String> lst = new ArrayList<>();
        int l = 0;
        if(sb.length() % 3 == 0) {
            for(int i=0; i < sb.length(); i+=3) {
                lst.add(sb.substring(i, i+3));
            }
            l++;
        } else {
            int a = sb.length() % 3;
            for(int i=sb.length()-3; i > 0; i-=3) {
                lst.add(sb.substring(i, i+3));
            }
            lst.add(sb.substring(0,a));
        }
        StringBuilder r = new StringBuilder();
        if(l == 0) {
            for (int i = lst.size() - 1; i >= 0; i--) {
                r.append(lst.get(i));
                r.append('.');
            }
        } else {
            for (int i = 0; i<lst.size(); i++) {
                r.append(lst.get(i));
                r.append('.');
            }
        }
        r.deleteCharAt(r.lastIndexOf("."));
        return r.toString();
    }
}
