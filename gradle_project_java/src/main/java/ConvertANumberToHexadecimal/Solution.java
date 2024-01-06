package ConvertANumberToHexadecimal;

public class Solution {
    public String toHex(int num) {
        String decToHex = "0123456789abcdef";
        if(num==0)
            return "0";
        String ans = "";
        while(num != 0){
            ans = decToHex.charAt(num&15) + ans;
            num = num >>> 4;
        }
        return ans;
    }
}
