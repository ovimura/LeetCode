package ValidPalindromeII;

public class Solution {
    public boolean validPalindrome(String s) {
        StringBuilder sb1 = new StringBuilder(s);
        sb1.reverse();
        StringBuilder sb2 = new StringBuilder(s);
        int n = sb1.length();
        if(!sb1.toString().equals(sb2.toString())) {
            for(int i=0; i<sb1.length(); i++) {
                if(sb1.charAt(i) != sb1.charAt(n-1-i)) {
                    StringBuilder s1 = new StringBuilder(s);
                    s1.deleteCharAt(i);
                    s1.reverse();
                    StringBuilder s2 = new StringBuilder(s);
                    s2.deleteCharAt(i);

                    if(s1.toString().equals(s2.toString()))
                        return true;

                    s1 = new StringBuilder(s);
                    s1.deleteCharAt(n-1-i);
                    s1.reverse();
                    s2 = new StringBuilder(s);
                    s2.deleteCharAt(n-1-i);
                    if(s1.toString().equals(s2.toString()))
                        return true;
                    else
                        return false;
                }
            }
            return false;
        } else
            return true;
    }
}
