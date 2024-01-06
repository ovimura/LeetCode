package GoogleInterview;

import javax.management.MBeanRegistration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Tutorial {
    public int sumNumbers(String str) {
        int sum = 0;
        String num = "";
        for(int i=0; i<str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num = num.concat(String.valueOf(str.charAt(i)));
                if(i == str.length()-1 && !Character.isDigit(str.charAt(i-1)))
                    sum += Integer.parseInt(num);
                else if(i+1 == str.length()-1 && Character.isDigit(str.charAt(i+1))) {
                    num = num.concat(String.valueOf(str.charAt(i)));
                    sum += Integer.parseInt(num);
                } else if((i+1 < str.length()) && !Character.isDigit(str.charAt(i+1))) {
                    sum += Integer.parseInt(num);
                }
            } else
                num = "";
        }
        return sum;
    }

    public boolean canBalance(int[] nums) {
        int lsum=0, rsum=1, i=0;
        while(lsum!=rsum && i<nums.length) {
            lsum = 0;
            rsum = 0;
            for(int j=0; j<=i; j++) {
                lsum += nums[j];
            }
            for(int j=i+1; j<nums.length; j++) {
                rsum += nums[j];
            }
            i++;
        }
        if(lsum == rsum)
            return true;
        return false;
    }

    public Map<String, String> mapShare(Map<String, String> map) {
        String aval = "";
        if(map.keySet().contains("a") && map.get("a")!=null) {
            aval = map.get("a");
            map.put("b", aval);
        }
        if(map.keySet().contains("c")) {
            map.remove("c");
        }
        return map;
    }

}
