package Dijkstra;
// Reference: https://www.geeksforgeeks.org/dijkstras-shortest-path-algorithm-greedy-algo-7/

/*
* Algorithm
* 1) Create a set sptSet (shortest path tree set) that keeps track of vertices included in shortest path tree, i.e.,
* whose minimum distance from source is calculated and finalized. Initially, this set is empty.
* 2) Assign a distance value to all vertices in the input graph. Initialize all distance values as INFINITE.
* Assign distance value as 0 for the source vertex so that it is picked first.
* 3) While sptSet doesn’t include all vertices
* ….a) Pick a vertex u which is not there in sptSet and has minimum distance value.
* ….b) Include u to sptSet.
* ….c) Update distance value of all adjacent vertices of u. To update the distance values, iterate through all adjacent
* vertices. For every adjacent vertex v, if sum of distance value of u (from source) and weight of edge u-v,
* is less than the distance value of v, then update the distance value of v.
*
* */
public class ShortestPathMatrixRepresentation {

    static final int V = 9;

    public int minDistance(int dist[], boolean sptSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;
        for(int v =0; v<V; v++) {
            if(sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        }
        return min_index;
    }

    public void printSolution(int dist[]) {
        System.out.println("Vertex \t\t Distnace from Source");
        for(int i=0; i<V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public void dijkstra(int graph[][], int src) {
        int dist[] = new int[V];
        boolean sptSet[] = new boolean[V];
        for(int i=0; i<V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;
        for(int count =0; count< V-1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for(int v=0; v< V; v++) {
                if(!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
            }
        }
        printSolution(dist);
    }
}
