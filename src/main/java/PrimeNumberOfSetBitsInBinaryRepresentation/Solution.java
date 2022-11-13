package PrimeNumberOfSetBitsInBinaryRepresentation;

public class Solution {
    public int countPrimeSetBits(int left, int right) {
        int r = 0;
        for(int i=left; i<=right; i++) {
            int count = 0;
            int q = i;
            while(q!= 0) {
                if((q & 1) == 1)
                    count++;
                q = q >> 1;
            }
            if(isPrime(count))
                r++;
        }
        return r;
    }

    public boolean isPrime(int n) {
        if(n == 2 || n == 3)
            return true;
        if(n <= 1 || n%2 == 0 || n%3 ==0)
            return false;
        for(int i = 5; i*i < n; i++) {
            if(i%2 == 0)
                return false;
        }
        return true;
    }
}
