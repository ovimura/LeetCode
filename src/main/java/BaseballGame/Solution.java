package BaseballGame;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Solution {
    public int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();
        Pattern pattern = Pattern.compile("-?(\\d+)?");
        for(String s: ops) {
            if(pattern.matcher(s).matches()) {
                scores.add(Integer.parseInt(s));
            } else if(s.equals("C")) {
                scores.remove(scores.size()-1);
            } else if(s.equals("D")) {
                scores.add(2*scores.get(scores.size()-1));
            } else if(s.equals("+")) {
                scores.add(scores.get(scores.size()-1) + scores.get(scores.size()-2));
            }
        }
        int sum = 0;
        for(int n: scores)
            sum += n;
        return sum;
    }
}
