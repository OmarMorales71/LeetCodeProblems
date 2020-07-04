package tree;

import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Level_Order_Traversal_II {
    public static void main(String[] args) {

    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root==null) return new LinkedList<>();
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new LinkedList<List<Integer>>();
        queue.add(root);

        while(!queue.isEmpty()){
            List<Integer> level = new LinkedList<>();
            int n = queue.size();
            while(n!=0){
                TreeNode current = queue.poll();
                level.add(current.val);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
                n--;
            }
            ans.add(0,level);
        }

        return ans;
    }
}
