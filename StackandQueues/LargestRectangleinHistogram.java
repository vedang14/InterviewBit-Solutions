package StackandQueues;

import java.util.Stack;

public class LargestRectangleinHistogram {
    public class Solution {
        public int largestRectangleArea(int[] A) {
            Stack<Integer>st = new Stack<Integer>();
            int maxArea = 0;
            int i=0, n = A.length;
            while(i<n){
                if(st.isEmpty() || A[st.peek()]<=A[i])
                st.push(i++);
                else{
                    int top = st.peek();
                    st.pop();
                    int area = A[top]*(st.empty()? i: (i-st.peek()-1));
                    maxArea = Math.max(maxArea,area);
                }
            }
            while(!st.isEmpty()){
                int top = st.peek();
                st.pop();
                int area = A[top]*(st.empty()? i: (i-st.peek()-1));
                
                maxArea = Math.max(maxArea,area);
            }
            return maxArea;
        }
    }
    
}