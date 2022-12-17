package NthTribonacciNumber;

/*
*
* The Tribonacci sequence Tn is defined as follows:
*
* T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
*
* Given n, return the value of Tn.
*
* */
public class Solution {
    int mem [] = new int[40];

    public int tribonacci(int n) {
        if(n <= 0)
            return 0;
        else if(n == 1 || n == 2)
            return 1;
        else {
            if(mem[n-1] == 0) {
                mem[n-1] = tribonacci(n-1);
            }
            if(mem[n-2] == 0) {
                mem[n-2] = tribonacci(n-2);
            }
            if(mem[n-3] == 0) {
                mem[n-3] = tribonacci(n-3);
            }
            return mem[n-3] + mem[n-2] + mem[n-1];
        }
    }
}
