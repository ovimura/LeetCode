package findWinnerOnATicTacToeGame;

import FindWinnerOnATicTacToeGame.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert "A" == s.tictactoe(new int[][]{{0,0},{2,0},{1,1},{2,1},{2,2}});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert "B" == s.tictactoe(new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert "Draw" == s.tictactoe(new int[][]{{0,0},{1,1},{2,0},{1,0},{1,2},{2,1},{0,1},{0,2},{2,2}});
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        assert "Pending" == s.tictactoe(new int[][]{{0,0},{1,1}});
    }

    @Test
    public void test5() {
        Solution s = new Solution();
        assert "B" == s.tictactoe(new int[][]{{0,0},{1,1},{0,1},{0,2},{1,0},{2,0}});
    }

    @Test
    public void test6() {
        Solution s = new Solution();
        assert "Pending" == s.tictactoe(new int[][]{{0,0},{1,2},{0,2},{1,1}});
    }
}
