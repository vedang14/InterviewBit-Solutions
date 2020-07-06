package LinkedList;

public class AddTwoNumbersAsaList {
    public class Solution {
        public ListNode addTwoNumbers(ListNode A, ListNode B) {
            ListNode head = null;
            ListNode prev = null;
            ListNode temp = null;
            int carry = 0,sum = 0;
            while(A != null || B!= null){
                sum = carry+(A!=null ? A.val :0 )+(B!= null ? B.val : 0);
                carry = (sum>=10) ? 1 : 0;
                sum = sum%10;
                temp = new ListNode(sum);
                if(head == null)
                    head = temp;
                else
                prev.next = temp;
                
                prev = temp;
                if(A!=null)
                    A = A.next;
                if(B!= null)
                    B = B.next;
            }
            if(carry>0)
                temp.next = new ListNode(carry);
            return head;
        }
    }
    
}