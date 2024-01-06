package ShuffleString;

public class Solution {
    public String restoreString(String s, int[] indices) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<indices.length; i++) {
            for(int j=0; j<indices.length; j++) {
                if(i == indices[j]) {
                    sb.append(s.charAt(j));
                    break;
                }
            }
        }
        return sb.toString();
    }
}
