package SplitAStringInBalancedStrings;

public class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int countR = 0, countL = 0;
        char[] chars = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            if(chars[i] == 'L') {
                countL++;
            } else if(chars[i] == 'R') {
                countR++;
            }
            if(countR > 0 && countL > 0 && countL == countR) {
                count++;
                countL = 0;
                countR = 0;
            }
        }
        return count;
    }
}
