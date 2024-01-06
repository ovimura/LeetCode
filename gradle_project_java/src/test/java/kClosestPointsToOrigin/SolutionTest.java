package kClosestPointsToOrigin;

import KClosestPointsToOrigin.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] arr = new int[][]{{1,3},{-2,2}};
        Assert.assertArrayEquals(new int[][]{{-2,2}}, s.kClosest(arr, 1));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        int[][] arr = new int[][]{{3,3},{5,-1},{-2,4}};
        System.out.println(s.kClosest(arr, 2)[0][0]);
        System.out.println(s.kClosest(arr, 2)[0][1]);
        System.out.println(s.kClosest(arr, 2)[1][0]);
        System.out.println(s.kClosest(arr, 2)[1][1]);
        int[][] a = s.kClosest(arr, 2);
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for(int[] s1 : a){
            sb.append(Arrays.toString(s1)).append(',');
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(']');
        String ss = sb.toString();
        System.out.println(ss);
        Assert.assertEquals("[[3, 3],[-2, 4]]", ss);
        //Assert.assertArrayEquals(new int[][]{{-2,4},{3,3}}, s.kClosest(arr, 2));
    }
}
