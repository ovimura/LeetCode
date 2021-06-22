package subdomainVisitCount;

import SubdomainVisitCount.Solution;

import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        s.subdomainVisits(new String[]{"9001 discuss.leetcode.com"});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        s.subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }
}
