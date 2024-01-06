package crawlerLogFolder;

import CrawlerLogFolder.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert 2 == s.minOperations(new String[]{"d1/","d2/","../","d21/","./"});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert 3 == s.minOperations(new String[]{"d1/","d2/","./","d3/","../","d31/"});
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert 0 == s.minOperations(new String[]{"d1/","../","../","../"});
    }
}
