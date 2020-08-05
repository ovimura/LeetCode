package DecryptStringFromAlphabetToIntegerMapping;

public class Solution {
    public String freqAlphabets(String s) {
        String result = "";
        int k = 1;
        for(int j=s.length()-1; j>=0; j-= k) {
            if(s.charAt(j) != '#') {
                result = (char)('a' + Character.getNumericValue(s.charAt(j))-1) + result;
                k = 1;
            } else {
                result = (char)('a' + Integer.valueOf(Integer.valueOf(s.substring(j-2, j)))-1) + result;
                k = 3;
            }
        }
        return result;
    }
}
