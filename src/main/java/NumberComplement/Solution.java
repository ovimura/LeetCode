package NumberComplement;

public class Solution {
    public int findComplement(int num) {
        int nOnes = 0;
        int n = num;
        while(num != 0) {
            nOnes++;
            num = num/2;
        }
        int mask = (int)(Math.pow(2, nOnes)-1);
        return n^mask;
    }

    public int findComplement_1(int num) {
        int nOnes = 0;
        int n = num;
        while(num != 0) {
            nOnes++;
            num = num/2;
        }
        int p = 1;
        for(int i=1; i<=nOnes; i++) {
            p = p*2;
        }
        int mask = (int)(p-1);
        return n^mask;
    }
}
