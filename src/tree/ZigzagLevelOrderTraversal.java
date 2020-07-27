package tree;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ZigzagLevelOrderTraversal {
    public static void main(String[] args) {

    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>>  ans = new ArrayList<List<Integer>>();
        if(root==null)
            return ans;

        boolean reverse=false;
        queue.add(root);

        while(!queue.isEmpty()){
            ArrayList<Integer> level = new ArrayList<Integer>();
            int numLevel = queue.size();
            while(numLevel!=0){
                TreeNode currentNum = queue.poll();
                numLevel--;

                if(currentNum.left!=null)
                    queue.add(currentNum.left);
                if(currentNum.right!=null)
                    queue.add(currentNum.right);


                if(reverse){
                    level.add(0,currentNum.val);
                }else{
                    level.add(currentNum.val);
                }

            }
            reverse=!reverse;
            ans.add(level);
        }
        return ans;
    }
}
