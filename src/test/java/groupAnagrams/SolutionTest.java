package groupAnagrams;

import GroupAnagrams.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<String>> ll = s.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        Assert.assertArrayEquals(new String[]{"eat", "tea", "ate"}, ll.get(0).stream().toArray(String[]::new));
        Assert.assertArrayEquals(new String[]{"bat"}, ll.get(1).stream().toArray(String[]::new));
        Assert.assertArrayEquals(new String[]{"tan","nat"}, ll.get(2).stream().toArray(String[]::new));
    }
}
