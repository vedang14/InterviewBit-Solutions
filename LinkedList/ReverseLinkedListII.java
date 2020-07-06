package LinkedList;

public class ReverseLinkedListII {
    public class Solution {
    public ListNode rotateRight(ListNode A, int B) {
        if(B==0)
        return A;
        ListNode kthNode = null;
        ListNode current = A;
        int count = 0;
        while(count<B+1 && current!=null){
            count++;
            current = current.next;
        }
        if(current==null)
        return A;
        
        kthNode = current;
        while(current.next!= null)
        current = current.next;
        
        current.next = A;
        A = kthNode.next;
        
        kthNode.next = null;
        
        return A;
    }
}
}