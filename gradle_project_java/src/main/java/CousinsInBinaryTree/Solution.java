package CousinsInBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    int h = -1;
    List<Integer> parents = new ArrayList<>();

    public boolean isCousins(TreeNode root, int x, int y) {
        findHeight(root, x, 0);
        getParents(root, x);
        List<Integer> pa = this.parents;
        int a = this.h;
        this.h = -1;
        this.parents = new ArrayList<>();
        findHeight(root, y, 0);
        getParents(root, y);
        List<Integer> pb = this.parents;
        int b = this.h;
        return a==b && !pa.get(0).equals(pb.get(0));
    }

    private void findHeight(TreeNode r, int n, int h) {
        if(r == null)
            return;
        if(r.val == n) {
            this.h = h;
        }
        if(r.left != null) {
            findHeight(r.left, n, h+1);
        }
        if(r.right != null) {
            findHeight(r.right, n, h+1);
        }
    }

    private void getParents(TreeNode r, int n) {
        if(r == null)
            return;
        else if(r.val == n) {
            return;
        } else if(r.left != null &&  r.left.val == n) {
            parents.add(r.val);
            return;
        } else if(r.right != null &&  r.right.val == n) {
            parents.add(r.val);
            return;
        }
        getParents(r.left, n);
        getParents(r.right, n);
    }

}
