package GetMaximumInGeneratedArray;

public class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0)
            return 0;
        else if (n == 1)
            return 1;
        int[] r = new int[n+1];
        r[0] = 0;
        r[1] = 1;
        int i=1;
        int max_idx = 0;
        while(max_idx != n) {
            int idx = 2*i;
            r[idx] = r[i];
            int next_idx = idx+1;
            if(next_idx > n)
                break;
            r[next_idx] = r[i] + r[i+1];
            max_idx = next_idx;
            i++;
        }
        int m = Integer.MIN_VALUE;
        for(int j=0; j<r.length; j++) {
            if(r[j]>m) {
                m = r[j];
            }
        }
        return m;
    }
}
