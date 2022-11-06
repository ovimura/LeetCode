package FindSmallestLetterGreaterThanTarget;

public class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char c = letters[0];
        for(char cc: letters) {
            if(cc > target) {
                c = cc;
                break;
            }
        }
        return c;
    }
}
