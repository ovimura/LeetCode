package RelativeRanks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] r = new String[score.length];
        int[] cpy = Arrays.copyOf(score, score.length);
        Arrays.sort(cpy);
        if(score.length == 0)
            return r;
        if(score.length == 1) {
            r[0] = "Gold Medal";
            return r;
        } else if (score.length == 2) {
            if(score[0] == cpy[0]) {
                r[0] = "Silver Medal";
                r[1] = "Gold Medal";
            } else if(score[0] == cpy[1]) {
                r[0] = "Gold Medal";
                r[1] = "Silver Medal";
            }
            return r;
        } else if(score.length == 3) {
            for(int i=0; i<score.length; i++) {
                for(int j=0; j < cpy.length; j++) {
                    if(score[i] == cpy[j] && j == 0) {
                        r[i] = "Bronze Medal";
                        break;
                    } else if(score[i] == cpy[j] && j == 1) {
                        r[i] = "Silver Medal";
                        break;
                    } else if(score[i] == cpy[j] && j == 2) {
                        r[i] = "Gold Medal";
                        break;
                    }
                }
            }
            return r;
        } else {
            for (int i = 0; i < score.length; i++) {
                for(int j=0; j<cpy.length; j++) {
                    if(score[i] == cpy[j] && j == cpy.length-3) {
                        r[i] = "Bronze Medal";
                        break;
                    } else if(score[i] == cpy[j] && j == cpy.length-2) {
                        r[i] = "Silver Medal";
                        break;
                    } else if(score[i] == cpy[j] && j == cpy.length-1) {
                        r[i] = "Gold Medal";
                        break;
                    } else if(score[i] == cpy[j]){
                        r[i] = String.valueOf(cpy.length-j);
                        break;
                    }
                }

            }
        }
        return r;
    }

    public String[] findRelativeRanks1(int[] score) {
        Map<Integer,String> rankMap = new HashMap<>();
        String[] result = new String[score.length];
        int[] copy = Arrays.copyOf(score,score.length);
        Arrays.sort(score);
        int rank = 4;
        for(int i=score.length-1;i>-1;i--) {
            if(i==score.length-1)  rankMap.put(score[i],"Gold Medal");
            else if(i==score.length-2)  rankMap.put(score[i],"Silver Medal");
            else if(i==score.length-3)  rankMap.put(score[i],"Bronze Medal");
            else {
                rankMap.put(score[i],String.valueOf(rank));
                rank++;
            }
        }
        for(int i=0;i<copy.length;i++) {
            result[i] = rankMap.get(copy[i]);
        }
        return result;
    }
}