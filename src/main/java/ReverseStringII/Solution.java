package ReverseStringII;

// https://leetcode.com/problems/reverse-string-ii/

public class Solution {

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        if(k > s.length())
            return sb.reverse().toString();
        else if (s.length() < 2*k && s.length() >= k){
            return new StringBuilder(sb.substring(0,k)).reverse() + sb.substring(k);
        } else if ((s.length() % (2*k)) == 0) {
            for(int i=0; i<s.length(); i+=(2*k)) {
                s= s.substring(0, i) + new StringBuilder(s.substring(i, i+k)).reverse().toString() + s.substring(i+k);
            }
        } else if (2*k % s.length() != 0) {
            int i = 0;
            for(; i<(s.length()-(s.length()%k)); i+=(2*k)) {
                s= s.substring(0, i) + new StringBuilder(s.substring(i, i+k)).reverse().toString() + s.substring(i+k);
            }
            if(i < s.length()) {
                s = s.substring(0, i) + new StringBuilder(s.substring(i)).reverse().toString();
            }
        }
        return s;
    }
}
