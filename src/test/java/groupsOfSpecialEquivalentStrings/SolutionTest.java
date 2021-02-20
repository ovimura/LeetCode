package groupsOfSpecialEquivalentStrings;

import GroupsOfSpecialEquivalentStrings.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.numSpecialEquivGroups(new String[]{"abcd","cdab","cbad","xyzz","zzxy","zzyx"}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.numSpecialEquivGroups1(new String[]{"abc","acb","bac","bca","cab","cba"}));
    }
}
