package Tree;

public class InvertBinaryTree {
    public class Solution {
        public TreeNode invertTree(TreeNode A) {
            if(A==null)
            return A;
            TreeNode left = invertTree(A.left);
            TreeNode right = invertTree(A.right);
            
            A.left = right;
            A.right = left;
            
            return A;
        }
    }
    
}