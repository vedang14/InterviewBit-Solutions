package StackandQueues;

import java.util.Stack;

public class RedundantBraces {
    public class Solution {
        public int braces(String A) {
            Stack<Character> st = new Stack<Character>();
            char arr[] = A.toCharArray();
            for(char s: arr){
                if(s==')'){
                    char top = st.peek();
                    st.pop();
                    boolean flag = true;
                    while(top != '('){
                        if(top == '+' || top == '-' || top == '*' || top =='/' )
                        flag = false;
                        
                        top = st.peek();
                        st.pop();
                    }
                    if(flag == true)
                    return 1;
                }
                else
                st.push(s);
            }
            return 0;
        }
    }
}