package ReformatPhoneNumber;

public class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();
        for(char c: number.toCharArray()) {
            if(Character.isDigit(c))
                sb.append(c);
        }
        if(sb.length() == 3) {
            return sb.toString();
        } else if(sb.length() % 3 == 0) {
            int i = 3;
            while(i < sb.length()) {
                sb.insert(i, '-');
                i += 4;
            }
            return sb.toString();
        } else if (sb.length() == 2) {
            return sb.toString();
        } else if (sb.length() == 4) {
            sb.insert(2, '-');
            return sb.toString();
        } else {
            if((sb.length()-2) %3 == 0) {
                int i = 3;
                int max = sb.length()-2;
                while(i < max) {
                    sb.insert(i, '-');
                    i += 4;
                    max = sb.length()-2;
                }
                sb.insert(sb.length()-2, '-');
                return sb.toString();
            } else if((sb.length()-4) %3 == 0) {
                int i = 3;
                int max = sb.length()-4;
                while(i < max) {
                    sb.insert(i, '-');
                    i += 4;
                    max = sb.length()-4;
                }
                sb.insert(sb.length()-4, '-');
                sb.insert(sb.length()-2, '-');
                return sb.toString();
            }
        }
        return "";
    }
}
