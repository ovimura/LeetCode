package checkArrayFormationThroughConcatenation;

import CheckArrayFormationThroughConcatenation.Solution;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution solution = new Solution();
        solution.canFormArray(new int[]{85}, new int[][]{{85}});
    }
}
