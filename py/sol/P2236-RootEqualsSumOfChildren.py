
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right

from typing import Optional


class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right


class Solution:
    def checkTree(self, root: Optional[TreeNode]) -> bool:
        temp_sum = root.left.val + root.right.val
        if temp_sum == root.val:
            return True
        return False


s = Solution()

t = TreeNode(5, TreeNode(3), TreeNode(1))

assert not (s.checkTree(t))



