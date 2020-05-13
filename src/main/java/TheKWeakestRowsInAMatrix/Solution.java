package TheKWeakestRowsInAMatrix;

import java.util.*;

public class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<Integer[]> count = new ArrayList<>();
        int n;
        for(int i=0; i<mat.length; i++) {
            n = 0;
            for(int j=0; j<mat[i].length; j++) {
                if(mat[i][j] == 1)
                {
                    n++;
                }
            }
            count.add(new Integer[]{i, n});
        }
//        Collections.sort(count, new Comparator<Integer[]>() {
//            @Override
//            public int compare(Integer[] o1, Integer[] o2) {
//                return Integer.compare(o1[0], o2[0]);
//            }
//        });
        Collections.sort(count, new Comparator<Integer[]>() {
            @Override
            public int compare(Integer[] o1, Integer[] o2) {
                    return Integer.compare(o1[1], o2[1]);
            }
        });
        int [] res = new int[k];
        for(int i=0; i<k; i++) {
            res[i] = count.get(i)[0];
        }
        return res;
    }


    public int[] kWeakestRows1(int[][] mat, int k) {
        int rows = mat.length;

        int[] score = new int[rows];
        for (int i = 0; i < rows; i++) {
            score[i] = soldierCnt(mat[i]) * rows + i;
        }

        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            // get rowIndex
            score[i] = score[i] % rows;
        }

        return Arrays.copyOfRange(score, 0, k);
    }

    public int soldierCnt(int[] row){
        int l=0;
        int r=row.length;
        while(l<r){
            int m = l+(r-l)/2;
            if(row[m]==1){
                l=m+1;
            }else{
                r=m;
            }
        }
        return l;
    }

}
