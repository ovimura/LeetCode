package StudentAttendanceRecordI;

public class Solution {
    public boolean checkRecord(String s) {
        int a = 0, l = 0;
        for(char c: s.toLowerCase().toCharArray()) {
            if(c != 'l')
                l = 0;
            if(c == 'a') {
                a++;
            }
            if(c == 'l') {
                l++;
            }
            if(a >= 2 || l >= 3)
                return false;
        }
        return true;
    }
}
