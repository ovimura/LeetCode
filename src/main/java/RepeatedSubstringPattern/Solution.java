package RepeatedSubstringPattern;

public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        boolean r = false;
        int mid = s.length()/2;
        for(int i=1; i<=mid; i++) {
            if(s.length() % i == 0) {
                if(s.substring(0, s.length()-i).equals(s.substring(i)))
                    return true;
            }
        }
        return r;
    }

    public boolean repeatedSubstringPattern_2(String s) {
        boolean r = false;
        int mid = s.length()/2;
        for(int i=1; i<=mid; i++) {
            if(s.length() % i == 0) {
                String s1 = s.substring(0, i);
                boolean flg = true;
                for(int j=i; j<s.length(); j+=i) {
                    if(!s1.equals(s.substring(j, j+i))) {
                        flg = false;
                    }
                }
                if(flg==true)
                    return true;
            }
        }
        return r;
    }
}
