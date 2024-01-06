package numberOfStudentsDoingHomeworkAtAGivenTime;

import NumberOfStudentsDoingHomeworkAtAGivenTime.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void tes1() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.busyStudent(new int[]{1,2,3}, new int[]{3,2,7}, 4));
    }

    @Test
    public void tes2() {
        Solution s = new Solution();
        Assert.assertEquals(1, s.busyStudent(new int[]{4}, new int[]{4}, 4));
    }

    @Test
    public void tes3() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.busyStudent(new int[]{4}, new int[]{4}, 5));
    }

    @Test
    public void tes4() {
        Solution s = new Solution();
        Assert.assertEquals(0, s.busyStudent(new int[]{1,1,1,1}, new int[]{1,3,2,4}, 7));
    }

    @Test
    public void tes5() {
        Solution s = new Solution();
        Assert.assertEquals(5, s.busyStudent(new int[]{9,8,7,6,5,4,3,2,1}, new int[]{10,10,10,10,10,10,10,10,10}, 5));
    }
}
