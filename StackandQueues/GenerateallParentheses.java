package StackandQueues;

import java.util.Stack;

public class GenerateallParentheses {
    public class Solution {
        public boolean matches(char temp,char top){
            if( (temp=='}' && top == '{') || (temp==']' && top =='[') || (temp==')' && top == '(') )
            return true;
            else 
            return false;
        }
        public int isValid(String A) {
            Stack<Character>st = new Stack<Character>();
            for(int i=0;i<A.length();i++){
                char temp = A.charAt(i);
                if(temp == '{' || temp == '(' || temp == '[')
                st.add(temp);
                else{
                    if(!st.isEmpty()){
                        if(matches(temp,st.peek()))
                        st.pop();
                        else 
                        return 0;
                    }
                    else
                    return 0;
                }
            }
            int ans = st.isEmpty()? 1:0;
            return ans;
        }
    }
    
}