package BackspaceStringCompare;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder(s);
        StringBuilder st = new StringBuilder(t);
        int n1 = sb.length();
        for(int i=0; i<n1; i++) {
            if(sb.charAt(i) == '#') {
                sb.deleteCharAt(i);
                if(i!=0) {
                    sb.deleteCharAt(i-1);
                    i = -1;
                    n1 = n1-2;
                    continue;
                }
                i = -1;
                n1 = n1-1;
            }
        }
        int n2 = st.length();
        for(int i=0; i<n2; i++) {
            if(st.charAt(i) == '#') {
                st.deleteCharAt(i);
                if(i!=0) {
                    st.deleteCharAt(i-1);
                    i = -1;
                    n2 = n2-2;
                    continue;
                }
                i = -1;
                n2 = n2-1;
            }
        }
        return sb.toString().equals(st.toString());
    }
}
