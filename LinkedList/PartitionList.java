package LinkedList;

public class PartitionList {
    public ListNode partition(ListNode A, int B) {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        
        ListNode curr = A;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr!= null){
            if(curr.val<B) {
                curr1.next = new ListNode(curr.val);
                curr1 = curr1.next;
            }
            else{
                curr2.next = new ListNode(curr.val);
                curr2 = curr2.next;
            }
            curr = curr.next;
        }
        curr1.next = l2.next;
        return l1.next;
    }
}
}