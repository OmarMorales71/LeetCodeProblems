package list;

import java.util.ArrayList;

public class ReorderList {

    public static void main(String[] args) {

    }

    public void reorderList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<ListNode>();

        while(head!=null){
            list.add(head);
            head=head.next;
        }

        int l=0, r=list.size()-1;
        ListNode last=null;
        while(l<=r){
            if(last==null){
                list.get(l).next=list.get(r);
                last=list.get(l).next;
            }else{
                if(l==r){
                    last.next=list.get(l);
                    last=list.get(l);
                }else{
                    list.get(l).next=list.get(r);
                    last.next=list.get(l);
                    last=list.get(r);
                }

            }
            l++;
            r--;
        }

        if(last!=null)
            last.next=null;

    }
}
