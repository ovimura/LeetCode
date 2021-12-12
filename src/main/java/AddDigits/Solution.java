package AddDigits;

public class Solution {
    public int addDigits(int num) {
        String n = String.valueOf(num);
        while(n.length()>1) {
            int v = 0;
            for (int i = 0; i < n.length(); i++) {
                v += Integer.valueOf(String.valueOf(n.charAt(i)));
            }
            n = String.valueOf(v);
        }
        return Integer.valueOf(n);
    }
}
