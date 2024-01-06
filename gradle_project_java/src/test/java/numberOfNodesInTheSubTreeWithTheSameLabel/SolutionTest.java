package numberOfNodesInTheSubTreeWithTheSameLabel;

import NumberOfNodesInTheSubTreeWithTheSameLabel.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new int[]{2,1,1,1,1,1,1}, s.countSubTrees(7, new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}}, "abaedcd"));
    }
}
