package tree;

public class BinaryTreePruning {
    public static void main(String[] args) {

    }

    public TreeNode pruneTree(TreeNode root) {
        return purgeZeros(root)!=0?root:null;
    }

    private int purgeZeros(TreeNode root) {
        if(root==null)
            return 0;

        int left = purgeZeros(root.left);
        if(left == 0){
            root.left=null;
        }
        int right = purgeZeros(root.right);
        if(right == 0){
            root.right=null;
        }
        int total = left + right + root.val;
        return total;
    }
}
