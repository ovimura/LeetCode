package checkArrayFormationThroughConcatenation;

import CheckArrayFormationThroughConcatenation.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        solution.canFormArray(new int[]{85}, new int[][]{{85}});
    }

    @Test
    public void test2() {
        Solution solution = new Solution();
        solution.canFormArray(new int[]{15,88}, new int[][]{{88},{15}});
    }

    @Test
    public void test3() {
        Solution solution = new Solution();
        solution.canFormArray(new int[]{49,18,16}, new int[][]{{16,18,49}});
    }

    @Test
    public void test4() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.canFormArray(new int[]{91,4,64,78}, new int[][]{{78}, {4,64}, {91}}));
    }

    @Test
    public void test5() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.canFormArray(new int[]{1,3,5,7}, new int[][]{{2,4,6,8}}));
    }
}
