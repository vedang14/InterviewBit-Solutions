package Backtracking;

public class Susbset {
    public class Solution {
        public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
            ArrayList<ArrayList<Integer>>ls = new ArrayList<ArrayList<Integer>>();
            ls.add(new ArrayList<Integer>());
            ArrayList<Integer>temp =new ArrayList<Integer>();
            if(A.size() == 0)
            return ls;
            Collections.sort(A);
            generate(A,ls,temp,0);
            return ls;
        }
        public void generate(ArrayList<Integer>A, ArrayList<ArrayList<Integer>>ls,ArrayList<Integer>temp,int index){
            for(int i = index;i<A.size();i++){
                temp.add(A.get(i));
                ls.add(new ArrayList<Integer>(temp));
                generate(A,ls,temp,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
    
}