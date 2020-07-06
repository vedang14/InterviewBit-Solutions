package StackandQueues;

import java.util.Stack;

public class ReverseString {
    public class Solution {
        public String reverseString(String A) {
            String ans = "";
            Stack<Character> st = new Stack<Character>();
            for(int i=0;i<A.length();i++){
                char temp = A.charAt(i);
                st.add(temp);
            }
            while(!st.isEmpty()){
                ans+= Character.toString(st.pop());
            }
            return ans;
        }
    }
}