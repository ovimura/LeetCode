package ReformatDate;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String reformatDate(String date) {
        String[] d1 = date.split(" ");
        String day;
        if(d1[0].length()<4)
            day = "0" + d1[0].substring(0,d1[0].length()-2);
        else
            day = d1[0].substring(0,d1[0].length()-2);
        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");
        String month = months.get(d1[1]);
        String year = d1[2];
        return year + "-" + month + "-" + day;
    }
}
