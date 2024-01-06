package findCommonCharacters;

import FindCommonCharacters.Solution;

import MiniParser.Sol;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<String> rs = s.commonChars(new String[]{"bella","label","roller"});
        Assert.assertArrayEquals(new String[]{"e","l","l"}, rs.toArray(new String[0]));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<String> rs = s.commonChars(new String[]{"cool","lock","cook"});
        Assert.assertArrayEquals(new String[]{"c","o"}, rs.toArray(new String[0]));
    }
}
