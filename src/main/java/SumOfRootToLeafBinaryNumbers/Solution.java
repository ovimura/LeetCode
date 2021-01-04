package SumOfRootToLeafBinaryNumbers;

import java.util.*;

public class Solution {

    Map<Integer, List<Integer>> map = new HashMap<>();

    public int sumRootToLeaf(TreeNode root) {
        int[] arr = new int[1000];
        traverse(root, arr, 0);
        int tmp = 0;
        for(Integer i: map.keySet()) {
            int pos = map.get(i).size()-1;
            for(Integer j: map.get(i)) {
                tmp += j * Math.pow(2, pos);
                pos--;
            }
        }
        return tmp;
    }

    public void traverse(TreeNode root, int[] path, int len) {
        if(root == null) {
            System.out.println();
            return;
        }
        path[len] = root.val;
        len++;
        if(root.left == null && root.right == null) {
            trace(path, len);
            return;
        }
        traverse(root.left, path, len);
        traverse(root.right, path, len);
    }

    public void trace(int[] path, int len) {
        List<Integer> ints = new ArrayList<>();
        for(int i=0; i<len; i++) {
            ints.add(path[i]);
        }
        if(map.keySet().size() == 0) {
            map.put(0, ints);
        } else {
            Set<Integer> set = map.keySet();
            map.put(set.size(), ints);
        }
    }
}
