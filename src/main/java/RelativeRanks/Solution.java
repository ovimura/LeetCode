package RelativeRanks;

import java.util.Arrays;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        int[] tmp = Arrays.copyOf(score, score.length);
        Arrays.sort(tmp);
        String[] answer = new String[score.length];
        for(int i=0; i<score.length; i++) {
            if(i==0)
                answer[i] = "Gold Medal";
        }
        return answer;
    }
}
