package checkIfAllOnesAreAtLeastLengthKPlacesAway;

import CheckIfAllOnesAreAtLeastLengthKPlacesAway.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        assert (s.kLengthApart(new int[]{1,0,0,0,1,0,0,1}, 2));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        assert !(s.kLengthApart(new int[]{1,0,0,1,0,1}, 2));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        assert (s.kLengthApart(new int[]{1,0,0,0,0}, 1));
    }
}
