package flippingAnImage;

import FlippingAnImage.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        int[][] arr = new int[][]{{1,1,0}, {1,0,1}, {0,0,0}};
        int[][] res = new int[][]{{1,0,0}, {0,1,0}, {1,1,1}};
        List<int[]> list = Arrays.asList(s.flipAndInvertImage(arr));
        for(int i=0; i<list.size(); i++) {
            Assert.assertArrayEquals(res[i], list.get(i));
        }
    }
}
