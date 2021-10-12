package pascalSTriangle;

import PascalSTriangle.Solution;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<Integer>> rs = s.generate(5);
        String out = rs.toString();
        Assert.assertEquals(out, "[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]");
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<List<Integer>> rs = s.generate(0);
        String out = rs.toString();
        System.out.println(out);
    }
}
