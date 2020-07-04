package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

public class PossibleBipartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean possibleBipartition(int N, int[][] dislikes) {
		int[] color = new int[N];
		int[] visited = new int[N];
		
		ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
		
		for(int i=0;i<N;i++) {
			nodeList.add(new GraphNode(i));
			
		}
		
		for(int[] currentEdge: dislikes) {
			GraphNode A = nodeList.get(currentEdge[0]-1);
			GraphNode B = nodeList.get(currentEdge[1]-1);
			
			A.neighbours.add(B);
			B.neighbours.add(A);
			
		}
		
		for(GraphNode source:nodeList) {
			if(!source.isVisited) {
				if(!bicolor(source))return false;
			}
			
		}
		 
		return true;
	}
	
	public boolean bicolor(GraphNode source) {
		LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
		source.color=1;
		queue.add(source);
		while(!queue.isEmpty()) {
			GraphNode node = queue.poll();
			int currentColor=node.color;
			if(!node.isVisited) {
				node.isVisited=true;
				for(GraphNode neighbour: node.neighbours) {
					if(!neighbour.isVisited) {
						if(neighbour.color==0 || neighbour.color!=currentColor) neighbour.color=(currentColor==1)?2:1;
						else return false;
						
						queue.add(neighbour);
					}
				}
			}
		}
		return true;
	}

}

class GraphNode{
	int val;
	boolean isVisited;
	int color;
	ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
	
	public GraphNode(int val) {
		this.val=val;
		isVisited=false;
		color=0;
	}
	
}
