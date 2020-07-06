public class Solution {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode A) {
        ArrayList<ArrayList<Integer>>ans = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode>q = new LinkedList<TreeNode>();
        q.add(A);
        boolean odd = true;
        if(A==null)
        return ans;
        else{
            while(!q.isEmpty()){
                ArrayList<Integer>aux = new ArrayList<Integer>();
                for(int size = q.size();size>0;size--){
                    TreeNode temp = q.remove();
                    if(odd)
                        aux.add(temp.val);
                    else
                        aux.add(0,temp.val);
                    if(temp.left!= null)
                        q.add(temp.left);
                    if(temp.right!=null)
                        q.add(temp.right);
                }
                odd = !odd;
                ans.add(aux);
            }
        }
        return ans;
    }
}