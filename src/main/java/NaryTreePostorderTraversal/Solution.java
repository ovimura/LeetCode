package NaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.List;

// https://stackoverflow.com/questions/2969033/recursive-breadth-first-travel-function-in-java-or-c
// https://www.netjstech.com/2019/03/binary-tree-traversal-breadth-first-serach-link-order-java.html
public class Solution {

    public List<Integer> postorder(Node root) {
        List<Integer> ints = new ArrayList<>();
        post(root);
        return new ArrayList();
    }

    public void post(Node r) {
        if(r == null)
            return;
        System.out.print(r.val);
        if(r.children == null)
            return;
        for(int i=0; i<r.children.size(); i++) {
            System.out.print(r.children.get(i).val);
        }
    }
}
