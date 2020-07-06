package Tree;

public class NextGreaterNumberBst {
    public class Solution {
        ArrayList<TreeNode>ls = new ArrayList<TreeNode>();
        public void inorder(TreeNode a){
            if(a==null)
            return ;
            
            inorder(a.left);
            ls.add(a);
            inorder(a.right);
        }
        public TreeNode getSuccessor(TreeNode a, int b) {
            inorder(a);
            for(int i=0;i<ls.size();i++){
                if(ls.get(i).val>b)
                return ls.get(i);
            }
            return null;
        }
    }
}