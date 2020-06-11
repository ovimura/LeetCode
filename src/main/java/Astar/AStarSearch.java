package Astar;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class AStarSearch {


    //h scores is the stright-line distance from the current city to Bucharest
    public static void main(String[] args){

        //initialize the graph base on the Romania map
        Nodee n1 = new Nodee("Arad",366);
        Nodee n2 = new Nodee("Zerind",374);
        Nodee n3 = new Nodee("Oradea",380);
        Nodee n4 = new Nodee("Sibiu",253);
        Nodee n5 = new Nodee("Fagaras",178);
        Nodee n6 = new Nodee("Rimnicu Vilcea",193);
        Nodee n7 = new Nodee("Pitesti",98);
        Nodee n8 = new Nodee("Timisoara",329);
        Nodee n9 = new Nodee("Lugoj",244);
        Nodee n10 = new Nodee("Mehadia",241);
        Nodee n11 = new Nodee("Drobeta",242);
        Nodee n12 = new Nodee("Craiova",160);
        Nodee n13 = new Nodee("Bucharest",0);
        Nodee n14 = new Nodee("Giurgiu",77);

        //initialize the edges

        //Arad
        n1.adjacencies = new Edge[]{
                new Edge(n2,75),
                new Edge(n4,140),
                new Edge(n8,118)
        };

        //Zerind
        n2.adjacencies = new Edge[]{
                new Edge(n1,75),
                new Edge(n3,71)
        };


        //Oradea
        n3.adjacencies = new Edge[]{
                new Edge(n2,71),
                new Edge(n4,151)
        };

        //Sibiu
        n4.adjacencies = new Edge[]{
                new Edge(n1,140),
                new Edge(n5,99),
                new Edge(n3,151),
                new Edge(n6,80),
        };


        //Fagaras
        n5.adjacencies = new Edge[]{
                new Edge(n4,99),

                //178
                new Edge(n13,211)
        };

        //Rimnicu Vilcea
        n6.adjacencies = new Edge[]{
                new Edge(n4,80),
                new Edge(n7,97),
                new Edge(n12,146)
        };

        //Pitesti
        n7.adjacencies = new Edge[]{
                new Edge(n6,97),
                new Edge(n13,101),
                new Edge(n12,138)
        };

        //Timisoara
        n8.adjacencies = new Edge[]{
                new Edge(n1,118),
                new Edge(n9,111)
        };

        //Lugoj
        n9.adjacencies = new Edge[]{
                new Edge(n8,111),
                new Edge(n10,70)
        };

        //Mehadia
        n10.adjacencies = new Edge[]{
                new Edge(n9,70),
                new Edge(n11,75)
        };

        //Drobeta
        n11.adjacencies = new Edge[]{
                new Edge(n10,75),
                new Edge(n12,120)
        };

        //Craiova
        n12.adjacencies = new Edge[]{
                new Edge(n11,120),
                new Edge(n6,146),
                new Edge(n7,138)
        };

        //Bucharest
        n13.adjacencies = new Edge[]{
                new Edge(n7,101),
                new Edge(n14,90),
                new Edge(n5,211)
        };

        //Giurgiu
        n14.adjacencies = new Edge[]{
                new Edge(n13,90)
        };

        AstarSearch(n1,n13);

        List<Nodee> path = printPath(n13);

        System.out.println("Path: " + path);


    }

    public static List<Nodee> printPath(Nodee target){
        List<Nodee> path = new ArrayList<Nodee>();

        for(Nodee node = target; node!=null; node = node.parent){
            path.add(node);
        }

        Collections.reverse(path);

        return path;
    }

    public static void AstarSearch(Nodee source, Nodee goal){
        Set<Nodee> explored = new HashSet<Nodee>();
        PriorityQueue<Nodee> queue = new PriorityQueue<Nodee>(20,
                new Comparator<Nodee>(){
                    //override compare method
                    public int compare(Nodee i, Nodee j){
                        if(i.f_scores > j.f_scores){
                            return 1;
                        }
                        else if (i.f_scores < j.f_scores){
                            return -1;
                        }
                        else{
                            return 0;
                        }
                    }
                }
        );

        //cost from start
        source.g_scores = 0;
        queue.add(source);
        boolean found = false;
        while((!queue.isEmpty())&&(!found)){
            //the node in having the lowest f_score value
            Nodee current = queue.poll();
            explored.add(current);
            //goal found
            if(current.value.equals(goal.value)){
                found = true;
            }
            //check every child of current node
            for(Edge e : current.adjacencies){
                Nodee child = e.target;
                double cost = e.cost;
                double temp_g_scores = current.g_scores + cost;
                double temp_f_scores = temp_g_scores + child.h_scores;
                                /*if child node has been evaluated and
                                the newer f_score is higher, skip*/
                if((explored.contains(child)) &&
                        (temp_f_scores >= child.f_scores)){
                    continue;
                }
                                /*else if child node is not in queue or
                                newer f_score is lower*/
                else if((!queue.contains(child)) ||
                        (temp_f_scores < child.f_scores)){
                    child.parent = current;
                    child.g_scores = temp_g_scores;
                    child.f_scores = temp_f_scores;
                    if(queue.contains(child)){
                        queue.remove(child);
                    }
                    queue.add(child);
                }
            }
        }
    }
}

class Nodee {

    public final String value;
    public double g_scores;
    public final double h_scores;
    public double f_scores = 0;
    public Edge[] adjacencies;
    public Nodee parent;

    public Nodee(String val, double hVal){
        value = val;
        h_scores = hVal;
    }

    public String toString(){
        return value;
    }

}

class Edge{
    public final double cost;
    public final Nodee target;

    public Edge(Nodee targetNode, double costVal){
        target = targetNode;
        cost = costVal;
    }
}