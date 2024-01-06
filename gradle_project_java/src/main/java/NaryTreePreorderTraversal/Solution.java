package NaryTreePreorderTraversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> traverse(Node r, List<Integer> ll) {
        if(r == null)
            return ll;
        ll.add(r.val);
        if(r.children != null) {
            for(int i=0; i<r.children.size(); i++) {
                traverse(r.children.get(i), ll);
            }
        }
        return ll;
    }

    public List<Integer> preorder(Node root) {
        return traverse(root, new ArrayList<>());
    }
}
