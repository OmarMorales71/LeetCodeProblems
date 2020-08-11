package tree;



public class Construct_Binary_Tree_from_Inorder_and_Postorder_Traversal {

    public static void main(String[] args) {

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length==0) return null;
        TreeNode root = new TreeNode(postorder[postorder.length-1]);
        int index = -1;

        for(int i = 0; i<inorder.length;i++){
            if(inorder[i]==root.val){
                index=i;
                break;
            }
        }

        int[] lefts = new int[index];
        int[] rights = new int[(inorder.length-index)-1];
        System.arraycopy(inorder, 0           , lefts, 0     , lefts.length);
        System.arraycopy(inorder, index+1           , rights, 0     , rights.length);
        assignChildren(root, lefts, rights, postorder);
        return root;
    }

    private void assignChildren(TreeNode root, int[] lefts, int[] rights, int[] postorder) {
        if(lefts.length==0 && rights.length==0){
            
        }
        assignChildren(root.left, lefts, rights,postorder);

        assignChildren(root.right, lefts, rights,postorder);
    }

}
