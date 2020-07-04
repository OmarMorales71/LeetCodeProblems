package tree;

public class InvertBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public TreeNode invertTree(TreeNode root) {
        postOrden(root);
        return root;
    }
	
	public void postOrden(TreeNode root) {
		if(root!=null) {
			postOrden(root.left);
			postOrden(root.right);
			TreeNode aux = root.left;
			root.left=root.right;
			root.right=aux;
		}
	}
}
