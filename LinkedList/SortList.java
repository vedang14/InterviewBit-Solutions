package LinkedList;

public class SortList {
    public class Solution {
        public ListNode sortList(ListNode A) {
            ArrayList<Integer>ls = new ArrayList<Integer>();
            ListNode curr = A;
            while(curr!= null){
                ls.add(curr.val);
                curr = curr.next;
            }
            Collections.sort(ls);
            ListNode ans = new ListNode(0);
            ListNode temp = ans;
            int i =0;
            while(i<ls.size()){
                temp.next = new ListNode(ls.get(i));
                temp = temp.next;
                i++;
            }
            return ans.next;
            
        }
    }
}