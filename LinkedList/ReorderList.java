package LinkedList;

public class ReorderList {
    public class Solution {
        public ListNode reverse(ListNode node){
            ListNode prev= null,curr = node, next ;
            while(curr!=null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            node = prev;
            return node;
        }
        public ListNode reorderList(ListNode A) {
            
            ListNode slow = A;
            ListNode fast = slow.next;
            if(slow!=null && fast == null)
            return A;
            while(fast !=null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            ListNode head = A;
            ListNode mid = slow.next;
            slow.next = null;
            mid = reverse(mid);
            A = new ListNode(0);
            ListNode curr = A;
            while(head != null || mid != null){
                if(head!=null){
                    curr.next = head;
                    head = head.next;
                    curr = curr.next;
                }
                if(mid != null){
                    curr.next = mid;
                    mid = mid.next;
                curr = curr.next;
            }
        }
        A = A.next;
        return A;
    }
}
}