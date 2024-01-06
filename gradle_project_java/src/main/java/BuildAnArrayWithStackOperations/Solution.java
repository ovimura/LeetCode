package BuildAnArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        int[] ints = new int[n];
        int z = 1;
        for(int k=0; k<ints.length; k++) {
            ints[k] = z++;
        }
        List<String> result = new ArrayList<>();
        int found = 0;
        for(int i=0; i<ints.length; i++) {
            int local = found;
            for(int j=0; j<target.length; j++) {
                if(target[j] == ints[i]) {
                    found++;
                    result.add("Push");
                }
            }
            if(found == local) {
                result.add("Push");
                result.add("Pop");
            } else if(found == target.length)
                return result;
        }
        return result;
    }
}
