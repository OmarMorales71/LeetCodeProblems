package tree;

public class SumOfLeftLeaves {

    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)
            return 0;
        int sum=0;

        return sumOfLeftLeaves(root, sum, false);
    }

    private int sumOfLeftLeaves(TreeNode root, int sum, boolean isLeft) {

        if(root.left==null && root.right==null){
            if(isLeft){
                sum+=root.val;
            }
        }else{
            int sumLeft=0;
            if(root.left!=null){
                sumLeft=sumOfLeftLeaves(root.left, 0, true);
            }

            int sumRight=0;
            if(root.right!=null){
                sumRight=sumOfLeftLeaves(root.right, 0, false);
            }

            sum=sumLeft+sumRight;
        }

        return sum;
    }

}
