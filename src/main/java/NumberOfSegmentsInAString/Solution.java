package NumberOfSegmentsInAString;

public class Solution {
    public int countSegments(String s) {
        int seg = 0;
        s = s.trim();
        if(s.length() == 0)
            return 0;
        for(int i=0; i<s.length()-1; i++) {
            if(s.charAt(i) == ' ') {
                if(s.charAt(i+1) != ' ')
                    seg++;
            }
        }
        return ++seg;
    }
}
