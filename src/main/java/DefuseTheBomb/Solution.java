package DefuseTheBomb;

public class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] r = new int[code.length];
        if(k > 0) {
            for(int i=0; i<code.length-1; i++) {
                int c = 1;
                int sum = 0;
                for(int j=i+1; j<code.length; j++) {
                    sum += code[j];
                    if(j == code.length-1)
                        j = -1;
                    if(c == k)
                        break;
                    c++;
                }
                r[i] = sum;
            }
            int c = 1;
            for(int o=0; o<code.length; o++) {
                r[code.length - 1] += code[o];
                if(o == code.length-1)
                    o = 0;
                if(c == k)
                    break;
                c++;
            }
            return r;
        } else if (k < 0) {
            for(int i=code.length-1; i>0; i--) {
                int c = -1;
                int sum = 0;
                for(int j=i-1; j>=0; j--) {
                    sum += code[j];
                    if(j == 0)
                        j = code.length;
                    if(c == k)
                        break;
                    c--;
                }
                r[i] = sum;
            }
            int c = -1;
            for(int o=code.length-1; o>=0; o--) {
                r[0] += code[o];
                if(o == 0)
                    o = code.length;
                if(c == k)
                    break;
                c--;
            }
            return r;
        } else {
            return r;
        }
    }
}
