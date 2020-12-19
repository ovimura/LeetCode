package NaryTreePostorderTraversal;

import java.util.*;

// https://stackoverflow.com/questions/2969033/recursive-breadth-first-travel-function-in-java-or-c
// https://www.netjstech.com/2019/03/binary-tree-traversal-breadth-first-serach-link-order-java.html
public class Solution {

    public List<Integer> postorder2(Node root) {
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
        LinkedList<Node> reversed = new LinkedList();
        l.add(r);
        v[r.val] = true;
        while(l.size() != 0) {
            r = l.poll();
            reversed.add(r);
            if(r.children != null) {
                for(int i=r.children.size()-1; i>=0; i--) {
                    if(v[r.children.get(i).val] != true) {
                        l.add(r.children.get(i));
                        v[r.children.get(i).val] = true;
                    }
                }
            }
        }
        String output = "";
        for(int j=reversed.size()-1; j>= 0; j--) {
            output = output.concat(Integer.toString(reversed.get(j).val) + ",");
        }
        System.out.print(output.substring(0, output.length()-1));
    }

    public void post3(Node r) {
        if(r == null)
            return;
        if(r.children == null)
            return;
        else
        for(int i=0; i<r.children.size(); i++) {
            post3(r.children.get(i));
        }
        System.out.print(r.val);
    }

    /*
    * [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
    * Actual: [14,11,12,13,6,7,8,9,10,2,3,4,5,1]
    * Expected: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]
    * */
    public List<Integer> postorder1(Node root) {
        boolean v[] = new boolean[10000];
        LinkedList<Node> l = new LinkedList();
        LinkedList<Node> reversed = new LinkedList();
        l.add(root);
        v[root.val] = true;
        while(l.size() != 0) {
            root = l.poll();
            reversed.add(root);
            if(root.children != null) {
                for(int i=root.children.size()-1; i>=0; i--) {
                    if(v[root.children.get(i).val] != true) {
                        l.add(root.children.get(i));
                        v[root.children.get(i).val] = true;
                    }
                }
            }
        }
        List<Integer> output = new ArrayList<>();
        for(int j=reversed.size()-1; j>= 0; j--) {
            output.add(reversed.get(j).val);
        }
        return output;
    }

    void dfs_util(Node root, boolean[] v) {
        v[root.val] = true;

        if(root.children != null)
            for(int i=0; i< root.children.size(); i++) {
                if(!v[root.children.get(i).val]) {
                    dfs_util(root.children.get(i), v);
                }
            }
        System.out.print(root.val + " ");
    }

    public void post4(Node r) {
        boolean v[] = new boolean[10000];
        dfs_util(r, v);
    }

    void dfs_alg(Node root, boolean[] v, List<Integer> rs) {
        if(root == null)
            return;
        v[root.val] = true;
        if(root.children != null)
            for(int i=0; i< root.children.size(); i++) {
//                if(!v[root.children.get(i).val]) {
                    dfs_alg(root.children.get(i), v, rs);
  //              }
            }
        System.out.print(root.val + " ");
        rs.add(root.val);
    }

    public List<Integer> postorder3(Node r) {
        boolean v[] = new boolean[10000];
        List<Integer> result = new ArrayList<>();
        dfs_alg(r, v, result);
        result.forEach(n -> {
            System.out.print(n);
        });
        return result;
    }

    void dfs_trv(Node root, List<Integer> rs) {
        if(root == null)
            return;
        if(root.children != null)
            for(int i=0; i< root.children.size(); i++) {
                dfs_trv(root.children.get(i), rs);
            }
        //System.out.print(root.val + " ");
        rs.add(root.val);
    }

    public List<Integer> postorder0(Node r) {
        List<Integer> result = new ArrayList<>();
        dfs_trv(r, result);
        result.forEach(n -> {
            System.out.print(n);
        });
        return result;
    }


    // Recursive solution
    void traverse(Node root, List<Integer> rs) {
        if(root == null)
            return;
        if(root.children != null)
            for(int i=0; i< root.children.size(); i++) {
                traverse(root.children.get(i), rs);
            }
        rs.add(root.val);
    }

    public List<Integer> postorder(Node r) {
        List<Integer> result = new ArrayList<>();
        traverse(r, result);
        return result;
    }

}
