package strings.and.arrays;

import java.util.LinkedList;

public class CousinsBinaryTree {
	static int parent = -100;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3));

		System.out.println(isCousins(root, 4, 3));
	}

	public static boolean isCousins(TreeNode root, int x, int y) {

		int a = getNode(root, 0, x);
		int aParent = parent;
		parent = -100;
		int b = getNode(root, 0, y);
		int bParent = parent;
		parent = -100;

		if(a==b) {
			if(aParent!=bParent) {
				return true;
			}
		}
		return false;

	}

	public static int getNode(TreeNode root, int depth, int target) {
		if (root == null) {
			return -1;
		} else if (root.val == target) {
			return depth;
		} else {
			int l = getNode(root.left, depth + 1, target);
			if (l > -1) {
				if (parent < 0) {
					parent = root.val;
				}

				return l;
			}
			int r = getNode(root.right, depth + 1, target);
			if (r > -1) {
				if (parent < 0) {
					parent = root.val;
				}
				return r;
			}

		}

		return -2;

	}

}

class TreeNode {
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
}
