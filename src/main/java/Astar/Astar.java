package Astar;

import java.util.*;

public class Astar {
    private final List<Node> open;
    private final List<Node> closed;
    private final List<Node> path;
    private final int[][] maze;
    private Node now;
    private final int xstart;
    private final int ystart;
    private int xend, yend;
    private final boolean diag;

    public Astar(int[][] maze, int xstart, int ystart, boolean diag) {
        this.open = new ArrayList<>();
        this.closed = new ArrayList<>();
        this.path = new ArrayList<>();
        this.maze = maze;
        this.now = new Node(null, xstart, ystart, 0, 0);
        this.xstart = xstart;
        this.ystart = ystart;
        this.diag = diag;
    }
    // Find path to xend/yend or return null
    public List<Node> findPathTo(int xend, int yend) {
        this.xend = xend;
        this.yend = yend;
        this.closed.add(this.now);
        addNeighborsToOpenList();
        while (this.now.x != this.xend || this.now.y != this.yend) {
            if(this.open.isEmpty()) {
                return null;
            }
            this.now = this.open.get(0);
            this.open.remove(0);
            this.closed.add(this.now);
            addNeighborsToOpenList();
        }
        this.path.add(0, this.now);
        while (this.now.x != this.xstart || this.now.y != this.ystart) {
            this.now = this.now.parent;
            this.path.add(0, this.now);
        }
        return this.path;
    }
    // Looks in a given List<> for a node
    private static boolean findNeighborInList(List<Node> array, Node node) {
        return array.stream().anyMatch((n)-> (n.x == node.x && n.y == node.y));
    }
    // Calculate distance between this.now and xend/yend and return (int) distance
    private double distance(int dx, int dy) {
        if(this.diag) {
            return Math.hypot(this.now.x + dx - this.xend, this.now.y + dy - this.yend);
        } else {
            return Math.abs(this.now.x + dx - this.xend) + Math.abs(this.now.y + dy -this.yend);
        }
    }
    private void addNeighborsToOpenList() {
        Node node;
        for(int x=-1; x<= 1; x++) {
            for(int y=-1; y<=1; y++) {
                if(!this.diag && x != 0 && y != 0) {
                    continue; // skip if diagonal movement is not allowed
                }
                node = new Node(this.now, this.now.x + x, this.now.y + y, this.now.g, this.distance(x,y));
                if((x!=0 || y!=0) // not this.now
                && this.now.x + x >= 0 && this.now.x + x < this.maze[0].length // check maze boundaries
                && this.now.y + y >= 0 && this.now.y + y < this.maze.length
                && this.maze[this.now.y + y][this.now.x + x] != -1 // check if square is walkable
                && !findNeighborInList(this.open, node) && !findNeighborInList(this.closed, node)) { // if not already done
                    node.g = node.parent.g + 1.0; // horizontal / vertical cost = 1.0
                    node.g += maze[this.now.y+y][this.now.x+x]; // add movement cost for this square
                    /*
                    * diagonal cost = sqrt(hor_cost^2 + ver_cost^2
                    * in this example the cost would be 12.2 instead of 11
                    *
                    * if(diag && x != 0 && y != 0) { node.g += 0.4} // Diagonal movement cost = 1.4
                    * */
                    this.open.add(node);
                }
            }
        }
        Collections.sort(this.open);
    }
}
