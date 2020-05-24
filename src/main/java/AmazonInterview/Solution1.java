package AmazonInterview;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public List<Integer> cellCompete(int[] states, int days) {
        List<Integer> result = null;
        List<Integer> copy = new ArrayList<>(states.length);
        for(int i=0; i<states.length; i++){
            copy.add(states[i]);
        }
        for(int d=0; d<days; d++) {
             result = new ArrayList<>(states.length);
            if (copy.get(1) == 0)
                result.add(0, 0);
            else
                result.add(0, 1);

            for (int j = 1; j < states.length - 1; j++) {
                if (copy.get(j - 1) != copy.get(j + 1))
                    result.add(j, 1);
                else
                    result.add(j, 0);
            }
            if (copy.get(6) == 0)
                result.add(7, 0);
            else
                result.add(7, 1);
            copy.clear();
            copy = new ArrayList<>(result.size());
            for(int i=0; i<result.size(); i++) {
                copy.add(i, result.get(i));
            }
        }
        return result;
    }
}
