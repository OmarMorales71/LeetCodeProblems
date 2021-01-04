package list;

public class MergeTwoSortedLists {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = null;

        if (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                root = new ListNode(l1.val, null);
                l1 = l1.next;

            } else {
                root = new ListNode(l2.val, null);
                l2 = l2.next;
            }
        } else if (l1 != null) {
            root = new ListNode(l1.val, null);
            l1 = l1.next;
        } else if (l2 != null) {
            root = new ListNode(l2.val, null);
            l2 = l2.next;
        }

        ListNode currentNode=root;

        while(l1 != null || l2 != null){
            if (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    currentNode.next = new ListNode(l1.val, null);
                    currentNode = currentNode.next;
                    l1 = l1.next;

                } else {
                    currentNode.next = new ListNode(l2.val, null);
                    currentNode = currentNode.next;
                    l2 = l2.next;
                }
            } else if (l1 != null) {
                currentNode.next = new ListNode(l1.val, null);
                currentNode = currentNode.next;
                l1 = l1.next;
            } else if (l2 != null) {
                currentNode.next = new ListNode(l2.val, null);
                currentNode = currentNode.next;
                l2 = l2.next;
            }
        }

        return root;
    }
}
