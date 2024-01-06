package occurrencesAfterBigram;

import OccurrencesAfterBigram.*;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"girl", "student"}, s.findOcurrences("alice is a good girl she is a good student", "a", "good"));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{}, s.findOcurrences("obo jvezipre obo jnvavldde jvezipre jvezipre jnvavldde jvezipre jvezipre jvezipre y jnvavldde jnvavldde obo jnvavldde jnvavldde obo jnvavldde jnvavldde jvezipre",
                "jnvavldde", "y"));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"kcyxdfnoa","kcyxdfnoa","kcyxdfnoa"}, s.findOcurrences("jkypmsxd jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa jkypmsxd kcyxdfnoa kcyxdfnoa jkypmsxd kcyxdfnoa",
                "kcyxdfnoa", "jkypmsxd"));
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        Assert.assertArrayEquals(new String[]{"we","we","will"}, s.findOcurrences("we we we we will rock you", "we", "we"));
    }
}
