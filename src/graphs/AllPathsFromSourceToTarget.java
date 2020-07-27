package graphs;

import java.util.ArrayList;
import java.util.List;

public class AllPathsFromSourceToTarget {

    public static void main(String[] args) {

    }
    ArrayList<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {



            ArrayList<Integer> path = new ArrayList<>();

            bfs(0, (ArrayList<Integer>)path.clone(), graph);

            return ans;

    }

    private void bfs(int i, ArrayList<Integer> path, int[][]graph) {
        path.add(i);
        if(i==graph.length-1){
            ans.add(path);
            return;
        }

        for(int j=0;j<graph[i].length;j++){
            bfs(graph[i][j],(ArrayList<Integer>)path.clone(),graph);
        }
    }
}
