package list;

import java.util.ArrayList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        PalindromeLinkedList obj = new PalindromeLinkedList();
        ListNode node= new ListNode(-129, new ListNode(-129));
        System.out.println(obj.isPalindrome(node));
    }

    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int l = 0, r = list.size() - 1;
        boolean pal = true;
        while (l < r) {
            if (list.get(l).intValue() != list.get(r).intValue()) {
                pal = false;
                break;
            }
            l++;
            r--;
        }

        return pal;
    }
}
