package DetermineIfStringHalvesAreAlike;

public class Solution {
    public boolean halvesAreAlike(String s) {
        char[] vowels = new char[]{'a','e','i','o','u'};
        int split = s.length()/2;
        int c1 = 0;
        int c2 = 0;
        for(int i=0; i<split; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            for(int j=0;j<vowels.length; j++) {
                if(c == vowels[j]) {
                    c1++;
                }
            }
        }
        for(int i=split; i<s.length(); i++) {
            char c = Character.toLowerCase(s.charAt(i));
            for(int j=0;j<vowels.length; j++) {
                if(c == vowels[j]) {
                    c2++;
                }
            }
        }
        return c1 == c2;
    }
}
