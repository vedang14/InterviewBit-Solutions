package StackandQueues;

import java.util.Stack;

public class NearestSmallerElement {
    public class Solution {
        public int[] prevSmaller(int[] A) {
            Stack<Integer>st = new Stack<Integer>();
            int arr[] = new int[A.length];
            for(int i=0;i<A.length;i++){
                while(!st.isEmpty() && st.peek()>=A[i]){
                    s.pop();
                }
                if(st.isEmpty())
                arr[i] =-1;
                else
                arr[i] = st.peek();
                
                
            }
            
        }
    }
    
    
}