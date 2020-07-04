package tree;

import java.util.ArrayList;

public class ValidateBinarySearchTree {
    ArrayList<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
    ValidateBinarySearchTree obj = new ValidateBinarySearchTree();
        System.out.println(obj.isValidBST(new TreeNode(1, new TreeNode(1),null)));
    }

    public boolean isValidBST(TreeNode root) {

        return inOrden(root);
    }

    private boolean inOrden(TreeNode root) {
        if (root != null) {
            if(!inOrden(root.left))
                return false;

            if (nums.size()==0 || nums.get(nums.size() - 1) < root.val) {
                nums.add(root.val);
            }else{
                return false;
            }

            if(!inOrden(root.right))
                return false;
        }else{
            return true;
        }
        return true;
    }


}
