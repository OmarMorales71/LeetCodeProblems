package tree;

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}

	public static void main(String ... args) throws Throwable {
		TreeNode a = new TreeNode(5);
		TreeNode b = a;
		b.val=999;
		System.out.println(a.val);
		b.finalize();
		a.finalize();
		System.gc();
		System.out.println(b.val);
	}
}
