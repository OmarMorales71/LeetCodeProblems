package list;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {

        Set<ListNode> isVisited = new HashSet<>();

        while(head!=null){
            if(isVisited.contains(head)){
                return true;
            }
            isVisited.add(head);
            head=head.next;
        }

        return false;
    }

    public boolean hasCycle2(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode rabbit = head;
        ListNode turtle = head;

        while(turtle.next!=null && rabbit.next!=null && rabbit.next.next!=null){
            turtle=turtle.next;//one step
            rabbit=rabbit.next.next;//two step

            if(turtle.val==rabbit.val){
                return true;
            }
        }

        return false;
    }
}
