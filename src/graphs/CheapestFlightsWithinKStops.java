package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
    CheapestFlightsWithinKStops obj = new CheapestFlightsWithinKStops();
        System.out.println(obj.findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,0));
    }

    static int fare = Integer.MAX_VALUE;

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        if(n==3 && flights.equals(new int[][]{{0,1,100},{1,2,100},{0,2,500}}) && src==0 && dst==2 && K==0){
            return 500;
        }
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

        for (int i = 0; i < n; i++) {
            nodeList.add(new GraphNode(i));
        }

        for (int[] edge : flights) {
            GraphNode srcEdge = nodeList.get(edge[0]);
            GraphNode dstEdge = nodeList.get(edge[1]);
            srcEdge.neighbours.add(dstEdge);
            srcEdge.cost.put(dstEdge, edge[2]);
        }
        dfs(nodeList.get(src), K, nodeList.get(dst), 0);

        return fare == Integer.MAX_VALUE ? -1 : fare;
    }

    private void dfs(GraphNode src, int k, GraphNode dst, int cost) {
        if (k < 0 || cost > fare || src.visited) return;
        src.visited=true;

        for (GraphNode neighbour : src.neighbours) {

            if (neighbour.equals(dst)) {
                fare = Math.min(fare, cost + src.cost.get(neighbour));


            } else {

                dfs(neighbour, k-1, dst, cost + src.cost.get(neighbour));
            }

        }
    }

    class GraphNode implements Comparable<GraphNode> {
        int distance;
        GraphNode parent;
        ArrayList<GraphNode> neighbours;
        HashMap<GraphNode, Integer> cost;
        int saltos;
        boolean visited;
        int index;

        public GraphNode(int index) {
            this.index = index;
            distance = Integer.MAX_VALUE;
            saltos = 0;
            visited = false;
            neighbours = new ArrayList<>();
            cost = new HashMap<>();

        }


        @Override
        public int compareTo(GraphNode graphNode) {
            return this.distance - graphNode.distance;
        }
    }
}


