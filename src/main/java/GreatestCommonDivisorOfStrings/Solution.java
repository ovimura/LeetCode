package GreatestCommonDivisorOfStrings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.equals(str2)) {
            return str1;
        }
        if(!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        if(str1.length() < str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }
        int l1 = str1.length(), l2 = str2.length();
        for(int i = l2; i>0; i--) {
            if(l1 % i != 0 || l2 % i != 0) {
                continue;
            }
            if(str1.substring(0, i).equals(str2.substring(0,i))) {
                return str1.substring(0, i);
            }
        }
        return "";
    }
}
