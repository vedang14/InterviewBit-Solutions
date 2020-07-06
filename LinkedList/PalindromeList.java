package LinkedList;

import java.util.Stack;

public class PalindromeList {
    public class Solution {
        public int lPalin(ListNode A) {
            Stack<Integer> st = new Stack<Integer>();
            ListNode head = A;
            while(head!= null){
                st.push(head.val);
                head = head.next;
            }
            ListNode temp = A;
            while(!st.isEmpty()){
                if(st.pop() != temp.val)
                return 0;
                
                temp = temp.next;
            }
            return 1;
        }
    }
}