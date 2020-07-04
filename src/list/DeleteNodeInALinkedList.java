package list;

public class DeleteNodeInALinkedList {

	public static void main(String[] args) {

		DeleteNodeInALinkedList obj = new DeleteNodeInALinkedList();
		ListNode1 a = new ListNode1(4);
		ListNode1 b = new ListNode1(5);
		ListNode1 c = new ListNode1(1);
		ListNode1 d = new ListNode1(9);

		a.next = b;
		b.next = c;
		c.next = d;

		obj.deleteNode(b);
		System.out.println();
	}

	public void deleteNode(ListNode1 node) {
		while (node != null) {

			node.val = node.next.val;
			
			if(node.next.next==null) {
				node.next=null;
			}
			node = node.next;

		}
	}

}

class ListNode1 {
	int val;
	ListNode1 next;

	ListNode1(int x) {
		val = x;
	}
}
