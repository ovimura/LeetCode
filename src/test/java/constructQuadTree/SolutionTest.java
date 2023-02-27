package constructQuadTree;

import ConstructQuadTree.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Node n = s.construct(new int[][]{{0,1},{1,0}});
        assert !n.val;
    }
}
