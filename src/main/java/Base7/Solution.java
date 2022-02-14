package Base7;

public class Solution {
    public String convertToBase7(int num) {
        StringBuilder sb = new StringBuilder();
        if(num<0) {
            num *= -1;
            sb.append('-');
        } else if (num == 0)
            sb.append("0");
        int p = 0;
        while(num > Math.pow(7,p)) {
            p++;
        }
        if(num == (int)Math.pow(7,p)) {
            sb.append(1);
            while(p>0) {
                sb.append(0);
                p--;
            }
        } else if (num < (int)Math.pow(7,p)) {
            p--;
            int sum = 0;
            while(p>=0) {
                int t = 0;
                while (num > sum + t * Math.pow(7, p)) {
                    t++;
                }
                if(num == sum +(t*Math.pow(7,p))) {
                    sb.append(t);
                    while(p>0) {
                        sb.append(0);
                        p--;
                    }
                    break;
                } else if (num < (sum + t*Math.pow(7,p))) {
                    t--;
                    sum += t*Math.pow(7,p);
                    sb.append(t);
                }
                p--;
            }
        }
        return sb.toString();
    }
}
