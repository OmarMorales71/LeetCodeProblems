package tree;

public class CountCompleteTreeNodes {
    public static void main(String[] args) {

    }

    public int countNodes(TreeNode root) {
        int ans = postOrder(root);

        return ans;
    }

    private int postOrder(TreeNode root) {
        if(root==null)
            return 0;

        int left = postOrder(root.left);
        int right= postOrder(root.right);

        return left + right +1;

    }
}
