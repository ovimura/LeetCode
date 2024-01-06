package selfDividingNumbers;

import org.junit.Assert;
import org.junit.Test;

import SelfDividingNumbers.Solution;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();

        List<Integer> l = s.selfDividingNumbers(1, 22);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22}, l.stream().mapToInt(Integer::intValue).toArray());
    }
}
