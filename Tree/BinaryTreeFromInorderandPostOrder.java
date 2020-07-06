public class Solution {
    int postEnd = 0;
    public TreeNode build(int A[],int B[],int inStart,int inEnd){
        if(inStart>inEnd)
        return null;
        TreeNode root = new TreeNode(B[postEnd--]);
        if(inStart== inEnd)
        return root;
        
        int index = find(A,inStart,inEnd,root.val);
        
        root.right = build(A,B,index+1,inEnd);
        root.left = build(A,B,inStart,index-1);
        
        return root;
    }
    public int find(int[] A,int start,int end,int val){
        for(int i=start;i<=end;i++){
            if(A[i]==val)
            return i;
        }
        return -1;
    }
    public TreeNode buildTree(int[] A, int[] B) {
        if(A.length==0)
        return null;
        postEnd = B.length-1;
        return build(A,B,0,postEnd);
    }
}