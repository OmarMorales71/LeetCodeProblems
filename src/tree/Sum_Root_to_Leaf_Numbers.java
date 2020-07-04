package tree;

public class Sum_Root_to_Leaf_Numbers {
    int ans = 0;
    public static void main(String[] args) {

    }

    public int sumNumbers(TreeNode root) {
        if(root==null) return 0;
        String num="";
        sum(root, num);
        return ans;
    }

    private void sum(TreeNode root, String num) {
        if(root==null) return;
        num+=root.val;

        if(root.right==null && root.left==null){
            ans+=Integer.parseInt(num);
        }else{
            sum(root.left, num);
            sum(root.right, num);
        }
    }
}
