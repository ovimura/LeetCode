package ReverseVowelsOfAString;

public class Solution {

    boolean isV(Character c) {
        return (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'I' || c == 'i' || c == 'o' || c == 'O'
                || c == 'u' || c == 'U');
    }

    public String reverseVowels(String s) {
        int j=0;
        String v = "";
        for(int i=0; i<s.length(); i++) {
            if(isV(s.charAt(i))){
                j++;
                v += s.charAt(i);
            }
        }
        char [] str = s.toCharArray();
        for(int i=0; i<s.length(); i++) {
            if(isV(s.charAt(i))) {
                str[i] = v.charAt(--j);
            }
        }
        return String.valueOf(str);
    }
}
