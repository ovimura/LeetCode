package buildAnArrayWithStackOperations;

import BuildAnArrayWithStackOperations.Solution;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        s.buildArray(new int[]{1,3}, 3).forEach(n->{
            System.out.println(n);
        });
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        s.buildArray(new int[]{1,2,3}, 3).forEach(n->{
            System.out.println(n);
        });
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        s.buildArray(new int[]{1,2}, 4).forEach(n->{
            System.out.println(n);
        });
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        s.buildArray(new int[]{2,3,4}, 4).forEach(n->{
            System.out.println(n);
        });
    }
}
