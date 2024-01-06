package LargestSubstringBetweenTwoEqualCharacters;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        char[] chars = s.toCharArray();
        int m = Integer.MIN_VALUE;
        for(int i=0; i<chars.length-1; i++) {
            char first = chars[i];
            int len = 0;
            for(int j=i+1; j<chars.length; j++) {
                if(chars[j] == first){
                    if(len > m)
                        m = len;
                }
                len++;
            }
        }
        if(m == Integer.MIN_VALUE)
            return -1;
        return m;
    }
}
