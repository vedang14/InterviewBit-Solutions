package Tree;

public class BSTIterator {
    public class Solution {
        public Stack<TreeNode> st ;
        public Solution(TreeNode root) {
            st = new Stack<TreeNode>();
            while(root!= null){
                st.push(root);
                root = root.left;
            }
        }
    
        /** @return whether we have a next smallest number */
        public boolean hasNext() {
            return !(st.isEmpy());
        }
    
        /** @return the next smallest number */
        public int next() {
            while(hasNext()){
                
            }
        }
    }
    
}