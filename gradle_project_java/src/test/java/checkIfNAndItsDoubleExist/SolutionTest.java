package checkIfNAndItsDoubleExist;

import CheckIfNAndItsDoubleExist.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert true == s.checkIfExist(new int[]{10,2,5,3});
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert false == s.checkIfExist(new int[]{3,1,7,11});
    }
}
