package MaximumNumberOfBalloons;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // balloon
    public int maxNumberOfBalloons(String text) {
        int[] balon = new int[5]; // balloon
        for(char c: text.toCharArray()) {
            if(c == 'b')
                balon[0]++;
            else if(c == 'a')
                balon[1]++;
            else if(c == 'l') {
                balon[2]++;
            } else if(c == 'o') {
                balon[3]++;
            } else if(c == 'n')
                balon[4]++;
        }
        balon[2] = balon[2]/2;
        balon[3] = balon[3]/2;
        int count = Integer.MAX_VALUE;
        for (int value : balon) {
            if (value < count)
                count = value;
        }
        return count;
    }
}
