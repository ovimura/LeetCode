package LicenseKeyFormatting;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String[] grps = s.split("-");
        StringBuilder sb = new StringBuilder();
        StringBuilder tmp = new StringBuilder();
        for(int i=0; i<grps.length; i++) {
            sb.append(grps[i]);
        }
        sb.reverse();
        for(int i=0; i<sb.length(); i += k) {
            if(i+k<sb.length()) {
                tmp.append(sb.subSequence(i, i + k));
                tmp.append("-");
            } else
                tmp.append(sb.subSequence(i,sb.length()));
        }
        return tmp.reverse().toString().toUpperCase();
    }
}
