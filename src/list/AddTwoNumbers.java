package list;

public class AddTwoNumbers {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans=null;
        ListNode temp=null;
        int res=0;
        while(l1!=null || l2!=null){
            int num1=0;

            if(l1!=null){
                num1=l1.val;
                l1=l1.next;

            }
            int num2=0;
            if(l2!=null){
                num2=l2.val;
                l2=l2.next;
            }
            int result = num1+num2+res;
            if(result<10){
                if(ans==null){
                    ans=new ListNode(result);
                    temp=ans;

                }else{
                    temp.next=new ListNode(result);
                    temp=temp.next;

                }
                res=0;
            }else{
                res=result/10;
                result=result%10;
                if(ans==null){
                    ans=new ListNode(result);
                    temp=ans;

                }else{
                    temp.next=new ListNode(result);
                    temp=temp.next;

                }
            }

        }
        if(res!=0){
            temp.next=new ListNode(res);
        }
        return ans;
    }
}
