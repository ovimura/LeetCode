package FairCandySwap;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sa = 0, sb = 0;
        for(int x: aliceSizes) sa += x;
        for(int x: bobSizes) sb += x;
        int d = (sb - sa) / 2;

        Set<Integer> setB = new HashSet<>();
        for(int x: bobSizes) setB.add(x);
        for(int x: aliceSizes) {
            if(setB.contains(x+d))
                return new int[]{x, x+d};
        }
        return new int[]{};
    }


    public int[] fairCandySwap_orig(int[] aliceSizes, int[] bobSizes) {
        int sa = 0, sb = 0;
        for(int i=0; i<aliceSizes.length; i++) {
            for(int j=0; j<bobSizes.length; j++) {
                int ai = aliceSizes[i];
                int bj = bobSizes[j];
                swap(aliceSizes, bobSizes, i, j);
                sa = 0;
                for(int a: aliceSizes)
                    sa += a;
                sb = 0;
                for(int b: bobSizes)
                    sb += b;
                if(sa == sb) {
                    return new int[]{ai, bj};
                }
                swap(aliceSizes, bobSizes, i, j);
            }
        }
        return new int[]{};
    }

    void swap(int[] a, int[] b, int i, int j) {
        int t = a[i];
        a[i] = b[j];
        b[j] = t;
    }
}
