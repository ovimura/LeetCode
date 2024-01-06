package averageOfLevelsInBinaryTree;

import org.junit.Assert;
import org.junit.Test;

import AverageOfLevelsInBinaryTree.*;

import java.util.List;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<Double> rs = s.averageOfLevels(root);
        rs.forEach(n-> {
            System.out.println(n);
        });
        Double[] bs = rs.stream().toArray(Double[]::new);
        Assert.assertArrayEquals(new Double[]{3.00000,14.50000,11.00000}, bs);
    }

    @Test
    public void test2() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        List<Double> rs = s.averageOfLevels(root);
        Double[] bs = rs.stream().toArray(n -> new Double[n]);
        Assert.assertArrayEquals(new Double[]{3.00000,14.50000,11.00000}, bs);
    }

    @Test
    public void test3() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,new TreeNode(9, new TreeNode(15), new TreeNode(7)), new TreeNode(20));
        List<Double> rs = s.averageOfLevels(root);
        Double[] bs = rs.stream().toArray(n -> new Double[n]);
        Assert.assertArrayEquals(new Double[]{3.00000,14.50000,11.00000}, bs);
    }

    @Test
    public void test4() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(3,new TreeNode(1, new TreeNode(0), new TreeNode(2)), new TreeNode(5, new TreeNode(4), new TreeNode(6)));
        List<Double> rs = s.averageOfLevels(root);
        Double[] bs = rs.stream().toArray(n -> new Double[n]);
        Assert.assertArrayEquals(new Double[]{3.00000,3.00000,3.00000}, bs);
    }
}
