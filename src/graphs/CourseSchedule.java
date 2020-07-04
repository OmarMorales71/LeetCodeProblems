package graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class CourseSchedule {

	public static void main(String[] args) {
		CourseSchedule obj = new CourseSchedule();
		
		System.out.println(obj.canFinish(3, new int[][] {{1,0},{2,0},{0,1}}));

	}

	public boolean canFinish(int numCourses, int[][] prerequisites) {
		ArrayList<GraphNode1> nodeList = new ArrayList<GraphNode1>();
		for (int i = 0; i < numCourses; i++) {
			nodeList.add(new GraphNode1(i));
		}

		for (int[] edge : prerequisites) {
			GraphNode1 a = nodeList.get(edge[1]);
			GraphNode1 b = nodeList.get(edge[0]);
			a.neighbours.add(b);
		}

		for (GraphNode1 currentNode : nodeList) {
			if (currentNode.status == 0) {
				boolean ans = bfs(currentNode);
				if (!ans) return false;
			}

		}

		return true;
	}

	private boolean bfs(GraphNode1 currentNode) {
		boolean a = true;
		if(currentNode.status==0) {
			
			currentNode.status=2;
			
			for(GraphNode1 neighbour:currentNode.neighbours) {
				if(neighbour.status==0) {
					a=bfs(neighbour);
					if (!a)break;
				}else if(neighbour.status==2) {
					return false;
				}
			}
			currentNode.status=1;
		}
		return a;
	}

}

class GraphNode1 {
	int val;
	int status; // 0-unvisited 1-visited 2-visiting
	ArrayList<GraphNode1> neighbours;

	public GraphNode1(int val) {
		this.val=val;
		status = 0;
		neighbours = new ArrayList<GraphNode1>();
	}
}
