package AddBinary;

public class Solution {
    public String addBinary(String a, String b) {
        String result = "";
        if(a.length()>b.length()) {
            int leadingZeros = a.length()-b.length();
            for(int i=0; i<leadingZeros; i++) {
                b = "0" + b;
            }
        } else if(a.length()<b.length()) {
            int leadingZeros = b.length()-a.length();
            for(int i=0; i<leadingZeros; i++) {
                a = "0" + a;
            }
        }
        int carryBit = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int a1 = Character.getNumericValue(a.charAt(i));
            int b1 = Character.getNumericValue(b.charAt(i));
            if ((a1 != b1)) {
                if(carryBit == 0)
                    result = "1" + result;
                else if(carryBit == 1)
                    result = "0" + result;
            } else if((a1 == b1) && (a1 == 1)) {
                if(carryBit == 0) {
                    result = "0" + result;
                    carryBit = 1;
                } else {
                    result = "1" + result;
                }
            } else if((a1 == b1) && (a1 == 0)) {
                if(carryBit == 1) {
                    result = "1" + result;
                    carryBit = 0;
                } else {
                    result = "0" + result;
                }
            }
        }
        if(carryBit == 1)
            result = "1" + result;
        return result;
    }
}
