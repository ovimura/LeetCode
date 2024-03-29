package NumberOfNodesInTheSubTreeWithTheSameLabel;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> g;
    private String labels;
    private int[] ans;
    private int[] seen;
    private int[] count;

    public int[] countSubTrees(int n, int[][] edges, String labels) {
        this.g = new ArrayList<List<Integer>>(n);
        this.labels = labels;
        for (int i = 0; i < n; ++i)
            this.g.add(new ArrayList<Integer>());
        for (int[] e : edges) {
            this.g.get(e[0]).add(e[1]);
            this.g.get(e[1]).add(e[0]);
        }
        this.ans = new int[n];
        this.seen = new int[n];
        this.count = new int[26];
        this.postOrder(0);
        return ans;
    }

    private void postOrder(int i) {
        if (this.seen[i]++ > 0) return;
        int before = this.count[this.labels.charAt(i) - 'a'];
        for (int j : this.g.get(i)) this.postOrder(j);
        this.ans[i] = ++this.count[this.labels.charAt(i) - 'a'] - before;
    }
}
