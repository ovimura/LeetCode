package ReverseString;

public class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        char temp = 0;
        for(int i=0; i<(len/2); i++) {
            temp = s[len-1-i];
            s[len-1-i] = s[i];
            s[i] = temp;
        }
    }
}
