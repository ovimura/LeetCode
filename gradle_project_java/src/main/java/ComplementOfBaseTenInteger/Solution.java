package ComplementOfBaseTenInteger;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int bitwiseComplement(int n) {
        if(n == 0)
            return 1;
        else if (n == 1)
            return 0;
        int complement = 0;
        List<Integer> bits = new ArrayList<>();
        while(n != 0) {
            bits.add(n&1);
            n /= 2;
        }
        for(int i=0; i<bits.size(); i++) {
            if(bits.get(i) == 0)
                complement += 1*Math.pow(2, i);
            else
                complement += 0*Math.pow(2, i);
        }
        return complement;
    }
}
