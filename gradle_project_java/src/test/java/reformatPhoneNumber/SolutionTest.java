package reformatPhoneNumber;

import ReformatPhoneNumber.*;

import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        String ss = s.reformatNumber("1-23-45 6");
        assert "123-456".equals(ss);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        String ss = s.reformatNumber("6785254496 0-82 040222");
        assert "678-525-449-608-204-02-22".equals(ss);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        String ss = s.reformatNumber("--17-5 229 35-39475 ");
        assert "175-229-353-94-75".equals(ss);
    }
}
