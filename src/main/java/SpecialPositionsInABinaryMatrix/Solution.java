package SpecialPositionsInABinaryMatrix;

public class Solution {
    public int numSpecial(int[][] mat) {
        int r = 0;
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 1) {
                    // test if it is special
                    int countOnes = 0;
                    for(int ii=0; ii<i; ii++) {
                        if(mat[ii][j] == 1)
                            countOnes++;
                    }
                    for(int ii=i+1; ii<mat.length; ii++) {
                        if(mat[ii][j] == 1)
                            countOnes++;
                    }
                    for(int jj=0; jj<j; jj++) {
                        if(mat[i][jj] == 1)
                            countOnes++;
                    }
                    for(int jj=j+1; jj<mat[i].length; jj++) {
                        if(mat[i][jj] == 1)
                            countOnes++;
                    }
                    if(countOnes == 0)
                        r++;
                }
            }
        }
        return r;
    }
}
