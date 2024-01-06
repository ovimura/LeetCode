package ConstructQuadTree;

public class Solution {
    public Node construct(int[][] grid) {
        Node root = build(grid, 0, 0, grid.length);
        return root;
    }

    public Node build(int[][] grid, int row, int col, int len) {
        Node n = new Node();
        int sum = 0;
        for(int i = row; i < row + len; i++) {
            for(int j = col; j < col + len; j++) {
                sum += grid[i][j];
            }
        }
        if(sum == len * len) {
            n.isLeaf = true;
            n.val = true;
        } else if(sum == 0) {
            n.isLeaf = true;
        } else {
            int half = len / 2;
            n.topLeft = build(grid, row, col, half);
            n.topRight = build(grid, row, col + half, half);
            n.bottomLeft = build(grid, row + half, col, half);
            n.bottomRight = build(grid, row + half, col + half, half);
        }
        return n;
    }
}
