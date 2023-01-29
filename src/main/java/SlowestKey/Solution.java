package SlowestKey;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int[] temp = new int[releaseTimes.length];
        temp[0] = releaseTimes[0];
        for(int i=1; i<temp.length; i++) {
            temp[i] = releaseTimes[i] - releaseTimes[i-1];
        }
        int max = Integer.MIN_VALUE;
        List<Character> slowestKeys = new ArrayList<>();
        for(int i=0; i<temp.length; i++) {
            if(temp[i]>max)
                max = temp[i];
        }
        for(int i=0; i<temp.length; i++) {
            if(temp[i] == max) {
                slowestKeys.add(keysPressed.charAt(i));
            }
        }
        Collections.sort(slowestKeys);
        return slowestKeys.get(slowestKeys.size()-1);
    }
}
