package DayOfTheYear;

public class Solution {
    public int dayOfYear(String date) {
        int years = Integer.parseInt(date.substring(0,4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
        int jan = 31;
        int feb = 28;
        if(years % 4 == 0 && years != 1900)
            feb = 29;
        int march = 31;
        int april = 30;
        int may = 31;
        int june = 30;
        int july = 31;
        int august = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;
        int [] calendar = new int[12];
        calendar[0] = jan;
        calendar[1] = feb;
        calendar[2] = march;
        calendar[3] = april;
        calendar[4] = may;
        calendar[5] = june;
        calendar[6] = july;
        calendar[7] = august;
        calendar[8] = sep;
        calendar[9] = oct;
        calendar[10] = nov;
        calendar[11] = dec;

        int days = 0;
        for(int i=0; i<month-1; i++) {
            days += calendar[i];
        }
        days += day;


        return days;
    }
}
