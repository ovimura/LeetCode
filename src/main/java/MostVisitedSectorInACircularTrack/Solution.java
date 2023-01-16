package MostVisitedSectorInACircularTrack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        List<Integer> r = new ArrayList<>();
        int[] sectors = new int[n+1];
        int c = 0;
        boolean start = false;
        for(int i=1; i<=n; i++) {
            if(!start && i == rounds[c]) {
                start = true;
                c++;
            } else if (start && rounds[c] == i) {
                sectors[i]++;
                start = false;
                c++;
                sectors[i]--;
                i--;
                c--;
            }
            if(start)
                sectors[i]++;
            if(i==n)
                i = 0;
            if(c == rounds.length)
                break;
        }
        int maxim_count = 0;
        for(int i=1; i<sectors.length; i++) {
            maxim_count = Math.max(maxim_count, sectors[i]);
        }
        for(int i=1; i<sectors.length; i++) {
            if(maxim_count == sectors[i]) {
                r.add(i);
            }
        }
        Collections.sort(r);
        return r;
    }
}
