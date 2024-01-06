package AddStrings;

public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb1 = new StringBuilder(num1);
        StringBuilder sb2 = new StringBuilder(num2);
        sb1.reverse();
        sb2.reverse();
        StringBuilder r = new StringBuilder();
        int len = Math.max(num1.length(), num2.length());
        int q = 0;
        for(int i=0; i<len; i++) {
            int t = 0;
            if(i<num1.length() && i<num2.length()) {
                t = Integer.valueOf(String.valueOf(sb1.charAt(i))) + Integer.valueOf(String.valueOf(sb2.charAt(i))) + q;
                q = 0;
                if(t<10) {
                    r.append(t);
                } else {
                    String st = String.valueOf(t);
                    q = Integer.valueOf(String.valueOf(st.charAt(0)));
                    int tt = Integer.valueOf(String.valueOf(st.charAt(1)));
                    r.append(tt);
                }
            } else if(i<num1.length()) {
                int n1 = 0;
                if(q == 0)
                    r.append(sb1.charAt(i));
                else {
                    n1 = Integer.valueOf(String.valueOf(sb1.charAt(i))) + q;
                    q = 0;
                    if(n1<10) {
                        r.append(n1);
                    } else {
                        String st = String.valueOf(n1);
                        q = Integer.valueOf(String.valueOf(st.charAt(0)));
                        int tt = Integer.valueOf(String.valueOf(st.charAt(1)));
                        r.append(tt);
                    }
                }
            } else if(i<num2.length()) {
                int n2 = 0;
                if(q == 0)
                    r.append(sb2.charAt(i));
                else {
                    n2 = Integer.valueOf(String.valueOf(sb2.charAt(i))) + q;
                    q = 0;
                    if(n2<10) {
                        r.append(n2);
                    } else {
                        String st = String.valueOf(n2);
                        q = Integer.valueOf(String.valueOf(st.charAt(0)));
                        int tt = Integer.valueOf(String.valueOf(st.charAt(1)));
                        r.append(tt);
                    }
                }
            }
        }
        if(q != 0)
            r.append(q);
        return r.reverse().toString();
    }
}
