package XOfAKindInADeckOfCards;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> m = new HashMap<>();
        for(int i: deck) {
            if(!m.containsKey(i)) {
                m.put(i, 1);
            } else {
                int v = m.get(i);
                v += 1;
                m.put(i, v);
            }
        }
        int val_max = -1;
        for(int k: m.keySet()) {
            if(val_max == -1)
                val_max = m.get(k);
            else if(val_max != m.get(k))
                val_max = Math.max(val_max, m.get(k));
        }
        for(int i=2; i<=val_max; i++) {
            int groups = 0;
            for(int k: m.keySet()) {
                if(m.get(k) % i == 0)
                    groups++;
            }
            if(groups == m.keySet().size())
                return true;
        }
        return false;
    }
}
