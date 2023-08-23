from typing import Optional


# Definition for a binary tree node.
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def evaluateTree(self, root: Optional[TreeNode]) -> bool:
        if root is not None and root.val == 0:
            return False
        elif root is not None and root.val == 1:
            return True
        if root is not None:
            if root.val == 2:
                return self.evaluateTree(root.left) or self.evaluateTree(root.right)
            elif root.val == 3:
                return self.evaluateTree(root.left) and self.evaluateTree(root.right)


s = Solution()

t = TreeNode(2, TreeNode(1), TreeNode(3, TreeNode(0), TreeNode(1)))


assert (s.evaluateTree(t))
assert (s.evaluateTree(TreeNode(1)))
assert not (s.evaluateTree(TreeNode(0)))
