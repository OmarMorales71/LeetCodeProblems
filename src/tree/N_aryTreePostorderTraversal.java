package tree;

import java.util.ArrayList;
import java.util.List;

public class N_aryTreePostorderTraversal {

    public static void main(String[] args) {

    }

    public List<Integer> postorder(Node root) {
        List<Integer> postList = new ArrayList<Integer>();

        ordering(root, postList);


        return postList;
    }

    public void ordering(Node current, List<Integer> ans) {

        if(current==null){
            return;
        }

        for(Node child: current.children){
            ordering(child, ans);
        }

        ans.add(current.val);
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    ;
}
