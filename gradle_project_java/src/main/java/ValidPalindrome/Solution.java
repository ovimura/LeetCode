package ValidPalindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        boolean answer = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i)))
                sb.append(Character.toLowerCase(s.charAt(i)));
        }

        StringBuilder sbtmp = new StringBuilder(sb).reverse();
        return sb.toString().equals(sbtmp.toString());
    }
}
