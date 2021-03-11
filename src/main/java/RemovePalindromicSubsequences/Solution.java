package RemovePalindromicSubsequences;

import java.util.Stack;

public class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i<j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public int removePalindromeSub(String s) {
        int steps = 0;
        int i = 0;
        int j = s.length()-1;
        String tmp = s;
        while (tmp != "") {
            if(i==j) {
                tmp =
            }
            if(isPalindrome(tmp.substring(i,j))) {
                tmp = tmp.substring(i,j);
                steps++;
                i = 0;
                j = tmp.length()-1;
            }
            j--;
        }
        return steps;
    }
}
