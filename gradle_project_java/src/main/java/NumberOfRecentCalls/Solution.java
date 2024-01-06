package NumberOfRecentCalls;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<Integer> pings;

    public Solution() {
        pings = new ArrayList<>();
    }

    public int ping(int t) {
        int low = t - 3000;
        pings.add(t);
        int count = 0;
        for(int i=0; i<pings.size(); i++) {
            if(pings.get(i) >= low && pings.get(i) <= t)
                count++;
        }
        return count;
    }
}
