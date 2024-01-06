package BaseballGame;

import java.util.ArrayList;
import java.util.List;
public class Solution {
    public int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();
        int sum = 0;
        for(String s: ops) {
            if(s.equals("C")) {
                sum -= scores.get(scores.size()-1);
                scores.remove(scores.size()-1);
            } else if(s.equals("D")) {
                sum +=2*scores.get(scores.size()-1);
                scores.add(2*scores.get(scores.size()-1));
            } else if(s.equals("+")) {
                sum += (scores.get(scores.size()-1) + scores.get(scores.size()-2));
                scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
            } else {
                    scores.add(Integer.parseInt(s));
                    sum += Integer.parseInt(s);
                }
        }
        return sum;
    }
}
