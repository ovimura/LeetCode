package FlipStringToMonotoneIncreasing;

public class Solution {
    public int minFlipsMonoIncr(String s) {
        int oneC = 0, flipC = 0;
        for(char c: s.toCharArray()) {
            if(c == '1') {
                oneC++;
            } else if (oneC >= 1) {
                flipC++;
            }
            flipC = Math.min(flipC, oneC);
        }
        return flipC;
    }
}
