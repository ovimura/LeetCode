package availableCapturesForRook;

import org.junit.Assert;
import org.junit.Test;
import AvailableCapturesForRook.Solution;

public class SolutionTest {
    @Test
    public void test1() {
        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        Solution s = new Solution();
        Assert.assertEquals(3, s.numRookCaptures(board));
    }

    @Test
    public void test2() {
        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','p','p','p','p','p','.','.'},
                {'.','p','p','B','p','p','.','.'},
                {'.','p','B','R','B','p','.','.'},
                {'.','p','p','B','p','p','.','.'},
                {'.','p','p','p','p','p','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        Solution s = new Solution();
        Assert.assertEquals(0, s.numRookCaptures(board));
    }

    @Test
    public void test3() {
        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'p','p','.','R','.','p','B','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','B','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };
        Solution s = new Solution();
        Assert.assertEquals(3, s.numRookCaptures(board));
    }
}
