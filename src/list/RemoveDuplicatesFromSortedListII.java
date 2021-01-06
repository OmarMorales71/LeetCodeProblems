package list;

public class RemoveDuplicatesFromSortedListII {

    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode root = null;
        ListNode lastNode = null;
        int currentValue = -999999;
        boolean isValid = false;
        while(head!=null){
            if(head.val!=currentValue){
                if(head.next!=null && head.val==head.next.val){
                    isValid=false;
                }else{
                    isValid=true;
                }
            }

            if(root == null && isValid){
                root = head;
                lastNode = head;
            }else if(isValid){
                lastNode.next=head;
                lastNode = head;
            }

            currentValue= head.val;
            head=head.next;
        }
        if(lastNode!=null){
            lastNode.next=null;
        }

        return root;
    }
}
