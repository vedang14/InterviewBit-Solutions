package LinkedList;

import java.util.Stack;

public class RemoveDuplicatesFromSortedList {
    public class Solution {
        public ListNode deleteDuplicates(ListNode A) {
            Stack<Integer>st = new Stack<Integer>();
            ListNode temp = A;
            st.add(temp.val);
            temp = temp.next;
            while(temp!=null){
                if(st.top==temp.val){
                st.pop();
                temp.next = temp.next.next;
                }
            }
        }
    }
}