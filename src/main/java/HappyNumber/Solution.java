package HappyNumber;

import java.util.LinkedHashSet;

public class Solution {
    public boolean isHappy(int n) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        set.add(n);
        String str = ((Integer)n).toString();
        int a = 0;
        while (true) {
            for (int k = 0; k < str.length(); k++) {
                int b = ((int)str.charAt(k)-48);
                a += b*b;
            }
            if (a == 1)
                return true;
            else if (set.contains(a))
                return false;
            set.add(a);
            str = ((Integer)a).toString();
            a = 0;
        }
    }
}
