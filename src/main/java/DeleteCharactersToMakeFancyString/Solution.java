package DeleteCharactersToMakeFancyString;

public class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.length() < 3)
            return s;
        else if(s.length() == 3) {
            if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2))
                return s.substring(0, 2);
            else
                return s;
        } else {
            int i=0;
            int dup = 1;
            while(i<s.length()-1) {
                if(s.charAt(i) != s.charAt(i+1)) {
                    if(dup >= 2) {
                        sb.append(s.charAt(i - 1));
                    }
                    sb.append(s.charAt(i));
                    dup = 1;
                } else if(s.charAt(i) == s.charAt(i+1)) {
                    dup++;
                }
                i++;
            }
            if(s.charAt(s.length()-1) != s.charAt(s.length()-2)) {
                sb.append(s.charAt(s.length()-1));
            } else if(s.charAt(s.length()-1) == s.charAt(s.length()-2) && dup>1) {
                sb.append(s.charAt(s.length()-1));
                sb.append(s.charAt(s.length()-1));
            }
        }
        return sb.toString();
    }
}
