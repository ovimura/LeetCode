package luckyNumbersInAMatrix;

import LuckyNumbersInAMatrix.Solution;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<Integer> ints = s.luckyNumbers(new int[][]{{3,7,8}, {9,11,13},{15,16,17}});
        System.out.println("-------------");
        for(int i=0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<Integer> ints = s.luckyNumbers(new int[][]{{1,10,4,2}, {9,3,8,7},{15,16,17,12}});
        System.out.println("-------------");
        for(int i=0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<Integer> ints = s.luckyNumbers(new int[][]{{7,8}, {1,2}});
        System.out.println("-------------");
        for(int i=0; i<ints.size(); i++) {
            System.out.println(ints.get(i));
        }
    }
}
