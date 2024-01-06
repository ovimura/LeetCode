package DayOfTheWeek;

public class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        month = (month+9)%12 + 1;
        if(month>10) year--;
        int D = year%100;
        int C = year/100;
        int f = day + (13*month-1)/5 + D + D/4 + C/4 - 2*C;
        f = f%7;
        if(f<0) f = f + 7;
        String[] days={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return days[Math.abs(f)];
    }
}
