package NumberOfLinesToWriteString;

public class Solution {
    public int[] numberOfLines_sol1(int[] widths, String s) {
        int [] r = new int[]{1,0};
        for (char c: s.toCharArray()) {
            int w = widths[c - 'a'];
            r[1] += w;
            if(r[1] > 100) {
                r[0]++;
                r[1] = w;
            }
        }
        return r;
    }





















    /*
    * You are given a string s of lowercase English letters and an array widths denoting how many pixels wide each
    * lowercase English letter is. Specifically, widths[0] is the width of 'a', widths[1] is the width of 'b', and so on.

    * You are trying to write s across several lines, where each line is no longer than 100 pixels. Starting at the
    * beginning of s, write as many letters on the first line such that the total width does not exceed 100 pixels.
    * Then, from where you stopped in s, continue writing as many letters as you can on the second line. Continue this
    * process until you have written all of s.

    * Return an array result of length 2 where:

    * result[0] is the total number of lines.
    * result[1] is the width of the last line in pixels.
    *
    * */

    public int[] numberOfLines(int[] widths, String s) {
        int lines = 0, w = 0;
        for(char c: s.toCharArray()) {
            w += widths[c - 'a'];
            if(w > 100) {
                w = widths[c - 'a'];
                lines++;
            }

        }
        return new int[]{++lines, w};
    }






}
