package list;

import java.util.Stack;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public ListNode reverseList(ListNode head) {
        if(head==null) return null;

        Stack<ListNode> stack = new Stack<>();
        stack.push(null);
        while(head!=null){
            stack.push(head);
            head=head.next;
        }

        ListNode newHead = stack.peek();
        ListNode x=null ,y=null;
        while(stack.size()!=1){
            x = stack.pop();
            x.next=stack.peek();

        }

        return newHead;
    }
}
