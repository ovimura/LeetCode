package numberOfStudentsUnableToEatLunch;

import NumberOfStudentsUnableToEatLunch.Solution;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void test1() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.countStudents(new int[]{1,1,0,0}, new int[]{0,1,0,1}));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        Assert.assertEquals(3, s.countStudents(new int[]{1,1,1,0,0,1}, new int[]{1,0,0,0,1,1}));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.countStudents(new int[]{0,0,0,1,1,1,1,0,0,0}, new int[]{1,0,1,0,0,1,1,0,0,0}));
    }
}
