package astar;

import org.junit.Test;
import Astar.Astar;
import Astar.Node;

import java.util.List;

public class AstarTest {
    @Test
    public void test1() {
        int[][] maze = {
                {0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0},
                {0,0,0,100,100,100,0,0},
                {0,0,0,0,0,100,0,0},
                {0,0,100,0,0,100,0,0},
                {0,0,100,0,0,100,0,0},
                {0,0,100,100,100,100,0,0},
                {0,0,0,0,0,0,0,0},
        };
        Astar astar = new Astar(maze, 0, 0, true);
        List<Node> path = astar.findPathTo(7,7);
        if(path!=null) {
            path.forEach((n)-> {
                System.out.print("[" + n.x + ", " + n.y + "] ");
                maze[n.y][n.x] = -1;
            });
            System.out.print("\nTotal cost: ");
            System.out.print(path.get(path.size()-1).g);
            System.out.println();
            for(int[] row: maze) {
                for(int e: row) {
                    switch (e) {
                        case 0:
                            System.out.print("_");
                            break;
                        case -1:
                            System.out.print("*");
                            break;
                        default:
                            System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }
}
