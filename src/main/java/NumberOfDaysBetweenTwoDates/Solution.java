package NumberOfDaysBetweenTwoDates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    public int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date d1 = myFormat.parse(date1);
            Date d2 = myFormat.parse(date2);
            long re = Math.abs(d2.getTime() - d1.getTime());
            long r = (re/(1000*3600*24));
            return (int)r;
        } catch (ParseException ex) {

        }
        return 0;
    }
}
