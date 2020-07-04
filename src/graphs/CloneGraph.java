package graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class CloneGraph {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public Node cloneGraph(Node node) {
		 
		 if(node==null)return null;
		 else if(node.neighbors.isEmpty())return new Node(node.val);
	          Node cloneGraphRoot = new Node(node.val);
		 	bfs(node, cloneGraphRoot);
		 return cloneGraphRoot;
		 }
		 
		 public void bfs(Node node, Node copy) {
			 LinkedList<Node> queue = new LinkedList<Node>();
			 LinkedList<Node> queueCopy = new LinkedList<Node>();
			 Node[] nodesCopies = new Node[101];
			 ArrayList<Node> isVisited = new ArrayList<Node>();
			 
			 queue.add(node);
	         nodesCopies[node.val]=copy;
			 queueCopy.add(copy);
			 
			 while(!queue.isEmpty()) {
				 Node currentNode = queue.poll();
				 Node currentcopy = queueCopy.poll();
				 
				 if(!isVisited.contains(currentNode)) {
					 isVisited.add(currentNode);
					 for(Node actualNode:currentNode.neighbors) {
						 if(nodesCopies[actualNode.val]==null) {
							 nodesCopies[actualNode.val]=new Node(actualNode.val);
						 }
						 currentcopy.neighbors.add(nodesCopies[actualNode.val]);
						 if(!isVisited.contains(actualNode)) {
							 queue.add(actualNode);
							 queueCopy.add(nodesCopies[actualNode.val]);
							 
						 }
					 }
				 }
			 }
		 }
	
}

class Node {
    public int val;
    public List<Node> neighbors;
    
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
