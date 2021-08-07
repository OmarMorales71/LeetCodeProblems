package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class N_aryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        N_aryTreeLevelOrderTraversal obj = new N_aryTreeLevelOrderTraversal();

    }

    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> levels = new ArrayList<List<Integer>>();
        Queue<Node> queue = new LinkedList<Node>();
        if (root != null)
            queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<Integer>();
            int sizeLevel = queue.size();
            while(sizeLevel>0){
                sizeLevel--;
                Node currentNode = queue.poll();
                level.add(currentNode.val);
                for(Node child: currentNode.children) {
                    queue.add(child);
                }
            }
            levels.add(level);
        }


        return levels;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
