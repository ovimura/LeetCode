package destinationCity;

import DestinationCity.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        List<List<String>> paths = new ArrayList<>(3);
        paths.add(Arrays.asList(new String[]{"London", "New York"}));
        paths.add(Arrays.asList(new String[]{"New York","Lima"}));
        paths.add(Arrays.asList(new String[]{"Lima","Sao Paulo"}));
        Assert.assertEquals("Sao Paulo", s.destCity(paths));
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        List<List<String>> paths = new ArrayList<>(3);
        paths.add(Arrays.asList(new String[]{"B","C"}));
        paths.add(Arrays.asList(new String[]{"D","B"}));
        paths.add(Arrays.asList(new String[]{"C","A"}));
        Assert.assertEquals("A", s.destCity(paths));
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        List<List<String>> paths = new ArrayList<>(1);
        paths.add(Arrays.asList(new String[]{"A","Z"}));
        Assert.assertEquals("Z", s.destCity(paths));
    }
}
