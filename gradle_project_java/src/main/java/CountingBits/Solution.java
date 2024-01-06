package CountingBits;

public class Solution {
    public int[] countBits(int n) {
        int[] r = new int[n+1];
        int count = 0;
        for(int i=0; i<=n; i++)
            r[i] = i;
        for(int j=0; j<=n; j++) {
            int t = r[j];
            count = 0;
            while(t>0) {
                if((t & 1) == 1)
                    count++;
                t = t >> 1;
            }
            r[j] = count;
        }
        return r;
    }
}
