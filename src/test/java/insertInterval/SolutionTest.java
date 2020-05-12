package insertInterval;

import InsertInterval.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest {

    @Test
    public void test1(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {
                {1,3},
                {6,9}
        };
        int[][] result = s.insert(intervals, new int[]{2,5});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 5][6, 9]", str);
    }

    @Test
    public void test2(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };
        int[][] result = s.insert(intervals, new int[]{4,8});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 2][3, 10][12, 16]", str);
    }

    @Test
    public void test3(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {
                {1,3},
                {6,9}
        };
        int[][] result = s.insert1(intervals, new int[]{2,5});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 5][6, 9]", str);
    }

    @Test
    public void test4(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {
                {1,2},
                {3,5},
                {6,7},
                {8,10},
                {12,16}
        };
        int[][] result = s.insert1(intervals, new int[]{4,8});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 2][3, 10][12, 16]", str);
    }

    public void test5(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {};
        int[][] result = s.insert1(intervals, new int[]{4,8});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 2][3, 10][12, 16]", str);
    }

    @Test
    public void test6(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {{1,5}};
        int[][] result = s.insert1(intervals, new int[]{2,3});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 5]", str);
    }
    @Test
    public void test7(){
        Solution s = new Solution();
        int[][] intervals = new int[][] {{1,5}};
        int[][] result = s.insert1(intervals, new int[]{6,8});
        String str = "";
        for(int i=0; i<result.length; i++) {
            str += Arrays.toString(result[i]);
        }
        Assert.assertEquals("[1, 5][6, 8]", str);
    }
}
