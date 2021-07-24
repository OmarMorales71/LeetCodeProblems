package list;

public class SwapNodesInPairs {

    public static void main(String[] args) {
        SwapNodesInPairs obj = new SwapNodesInPairs();
        ListNode node4 = new ListNode(4);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode head = new ListNode(1, node2);

        System.out.println(obj.swapPairs(head));
    }

    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode ans = head.next;

        ListNode firstNode=head;
        ListNode secondNode = head.next;

        while(true) {
            if(secondNode.next==null){
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;
                break;
            }else if(secondNode.next.next==null){
                firstNode.next = secondNode.next;
                secondNode.next = firstNode;
                break;
            }else{
                firstNode.next = secondNode.next.next;
                ListNode temp1 = secondNode.next;
                ListNode temp2 = firstNode.next;
                secondNode.next = firstNode;
                secondNode = temp2;
                firstNode = temp1;
            }
        }
        return ans;
    }
}
