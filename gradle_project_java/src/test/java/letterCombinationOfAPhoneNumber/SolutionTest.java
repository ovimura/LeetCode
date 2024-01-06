package letterCombinationOfAPhoneNumber;

import LetterCombinationOfAPhoneNumber.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String[] str = s.letterCombinations("23").stream().toArray(String[]::new);
        Assert.assertArrayEquals(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, str);
        str = s.letterCombinations("2").stream().toArray(String[]::new);
        Assert.assertArrayEquals(new String[]{"a","b","c"}, str);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String[] str = s.letterCombinations("234").stream().toArray(String[]::new);
        Assert.assertArrayEquals(new String[]{"adg", "adh", "adi", "aeg", "aeh", "aei", "afg",
                "afh", "afi", "bdg", "bdh", "bdi", "beg", "beh", "bei", "bfg", "bfh", "bfi", "cdg",
                "cdh", "cdi", "ceg", "ceh", "cei", "cfg", "cfh", "cfi"}, str);
    }
}
