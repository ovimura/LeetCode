package serializeAndDeserializeBinaryTree;

import SameTree.TreeNode;
import SerializeAndDeserializeBinaryTree.Solution;
import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

public class SolutionTest {
    @Test
    public void test1() {
        Solution s = new Solution();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        String str = s.serialize(root);
        Assert.assertEquals("", str);
        TreeNode r = s.deserialize(str);
    }
}
