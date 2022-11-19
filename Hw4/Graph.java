import java.util.ArrayList;

public class Graph {
    ArrayList<ArrayList<Integer>> graph;
    int v;

    Graph(int nodes){
        v = nodes;
        graph = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i < v; i ++){
            graph.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int v, int v2){
        graph.get(v).add(v2);
        graph.get(v2).add(v);
    }
    void printGraph(){
        for(int i = 1; i < v; i++){
            System.out.println("Node" + i+ ":");

            for(int x : graph.get(i) ){
                System.out.println(x);

            }
        }
    }
}
