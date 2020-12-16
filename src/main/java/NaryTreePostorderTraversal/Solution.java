package NaryTreePostorderTraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public void post1(Node r) {
        boolean visited[] = new boolean[10000];

        LinkedList<Node> q = new LinkedList<>();

        visited[r.val] = true;

        q.add(r);
        while(q.size() != 0) {
            r = q.poll();
            System.out.print(r.val);
            if(r.children != null) {
                for(int i=0; i<r.children.size(); i++) {
                    Node n = r.children.get(i);
                    if(visited[n.val] == false) {
                        visited[n.val] = true;
                        q.add(n);
                    }
                }
            }
        }
    }

    public void post2(Node r) {
        boolean v[] = new boolean[10000];
        LinkedList<Node> l = new LinkedList();
        l.add(r);
        v[r.val] = true;
        while(l.size() != 0) {
            r = l.poll();
            System.out.print(r.val + " ");
            if(r.children != null) {
                r.children.forEach(n -> {
                    if(v[n.val] != true) {
                        l.add(n);
                        v[n.val] = true;
                    }
                });
            }
        }
    }
}
