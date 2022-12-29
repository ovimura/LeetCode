package checkIfItIsAStraightLine;

import CheckIfItIsAStraightLine.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert false == s.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert true == s.checkStraightLine(new int[][]{{0,0},{0,1},{0,-1}});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert false == s.checkStraightLine(new int[][]{{0,0},{0,5},{5,0},{1337,0},{0,1337}});
    }
}
