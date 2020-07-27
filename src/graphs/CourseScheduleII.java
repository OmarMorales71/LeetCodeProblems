package graphs;

import java.util.ArrayList;
import java.util.Stack;

public class CourseScheduleII {
    public static void main(String[] args) {
        CourseScheduleII obj = new CourseScheduleII();
        System.out.println(obj.findOrder(3, new int[][]{{1,0},{2,1},{0,2}}));
    }

    Stack<GraphNode> ans = new Stack<GraphNode>();
    boolean impossible = false;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        for (int i = 0; i < numCourses; i++) {
            nodeList.add(new GraphNode(i));
        }

        for(int[] edge: prerequisites){
            GraphNode preCourse = nodeList.get(edge[1]);
            GraphNode course = nodeList.get(edge[0]);

            preCourse.neighbours.add(course);
        }
        
        for(GraphNode node: nodeList){
            if(node.status==0){
                topologicalSort(node);
            }
        }

        if(impossible){
            return new int[]{};
        }
        int[] ansFinal = new int[numCourses];

        for(int i = 0 ; i<numCourses; i++){
            ansFinal[i]=ans.pop().val;
        }

        return ansFinal;
    }

    private void topologicalSort(GraphNode node) {

        if(node.status==0){
            node.status=2;

            for(GraphNode n:node.neighbours){
                    topologicalSort(n);
            }
            node.status=1;
            ans.push(node);
        }else if(node.status==1){
            return;
        }else if(node.status==2){
            impossible=true;
            return;
        }

    }

    private class GraphNode {
        int val;
        int status; // 0-unvisited 1-visited 2-visiting
        ArrayList<GraphNode> neighbours;

        public GraphNode(int val) {
            this.val = val;
            status = 0;
            neighbours = new ArrayList<GraphNode>();
        }
    }
}
