package countLargestGroup;

import CountLargestGroup.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int r = s.countLargestGroup(13);
        assert 4 == r;
    }
}
