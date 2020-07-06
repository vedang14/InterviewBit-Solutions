package Tree;

public class BinaryTreeFromInorderandPreOrder {
    public class Solution {
        int preStart = 0;
        public TreeNode build(int []A,int []B,int inStart,int inEnd){
            if(inStart>inEnd)
            return null;
            TreeNode root = new TreeNode(A[preStart++]);
            if(inStart==inEnd)
            return root;
            
            int ind = find(B,inStart,inEnd,root.val);
            
            root.left = build(A,B,inStart,ind-1);
            root.right = build(A,B,ind+1,inEnd);
            
            return root;
            
        }
        public int find(int B[],int start,int end,int val){
            for(int i=start;i<=end;i++){
                if(B[i]==val)
                return i;
            }
            return -1;
        }
        public TreeNode buildTree(int[] A, int[] B) {
            if(A.length==0)
            return  null;
            preStart = 0;
            return build(A,B,0,B.length-1);
        }
    }
    
}