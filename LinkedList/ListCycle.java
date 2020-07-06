package LinkedList;

public class ListCycle {
    public class Solution {
        public ListNode detectCycle(ListNode a) {
            // ListNode slw = a;
            // ListNode fast = a;
            // while(slw != null && fast != null && fast.next!=null){
            //     slw = slw.next;
            //     fast = fast.next.next;
            //     if(slw == fast)
            //     return slw;
            // }
            // return null;
            ListNode slow = a;
            ListNode fast = a;
            
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                
                if (slow == fast) {
                    break;
                }
            }
            
            if (fast == null || fast.next == null) return null;
            
            slow = a;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            
            return slow;
        }
    }
    
}