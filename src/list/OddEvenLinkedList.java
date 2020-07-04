package list;

public class OddEvenLinkedList {

	public static void main(String[] args) {
		System.out.println(2%2);

	}

	public ListNode oddEvenList(ListNode head) {
		if(head==null )return head;
		ListNode odd=head;
		ListNode last_odd=head;
		ListNode even=head.next;
		ListNode last_even=head.next;
		
		if(odd!=null && even!=null) {
			int i=1;
			ListNode aux = odd;
			while(aux!=null) {
				if(i%2==0) {
					aux=last_even.next.next;
					if(aux!=null) {
						last_even.next=aux;
						last_even=last_even.next;
					}
				}else {
					aux=last_odd.next.next;
					if(aux!=null) {
						last_odd.next=aux;
						last_odd=last_odd.next;
					}
				}
				i++;
			}
			
			last_odd.next=even;
			last_even.next=null;
			
		}
		
		return head;
	}

}


