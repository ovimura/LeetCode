package CalculateAmountPaidInTaxes;

public class Solution {
    public double calculateTax(int[][] brackets, int income) {
        if(income == 0.0)
            return 0.0;
        double tax = 0.0;
        int lower = 0;
        for(int i=0; i<brackets.length; i++) {
            if(income >= lower && income <= brackets[i][0]){
                tax += (income - lower)*brackets[i][1];
                lower = brackets[i][0];
            } else if(income > brackets[i][0]) {
                tax += (brackets[i][0] - lower)*brackets[i][1];
                lower = brackets[i][0];
            }
        }
        return tax/100;
    }
}
