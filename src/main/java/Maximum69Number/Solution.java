package Maximum69Number;

public class Solution {
    public int maximum69Number (int num) {
        Integer i = new Integer(num);
        StringBuilder str = new StringBuilder(i.toString());
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(int j=0; j<i.toString().length(); j++) {
            if(str.charAt(j) == '6' && count == 0) {
                sb.insert(j, "9");
                count++;
            } else {
                sb.insert(j, str.charAt(j));
            }
        }
        return Integer.parseInt(sb.toString());
    }
}
