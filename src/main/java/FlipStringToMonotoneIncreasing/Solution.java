package FlipStringToMonotoneIncreasing;

// Reference: https://medium.com/@smartsplash/flip-string-to-monotone-increasing-in-o-n-time-b9242fe2a4fb
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
