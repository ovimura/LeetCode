package minimumAbsoluteDifference;

import MinimumAbsoluteDifference.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        s.minimumAbsDifference(new int[]{4,2,1,3}).forEach(n-> {
            System.out.println(n.get(0) + " " + n.get(1));
        });
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        s.minimumAbsDifference(new int[]{1,3,6,10,15}).forEach(n-> {
            System.out.println(n.get(0) + " " + n.get(1));
        });
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        s.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}).forEach(n-> {
            System.out.println(n.get(0) + " " + n.get(1));
        });
    }
}
