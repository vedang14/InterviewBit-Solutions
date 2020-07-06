package Backtracking;

import java.util.ArrayList;

public class CombinationSumII {
    public class Solution {
        public void generate(ArrayList<Integer>a,ArrayList<ArrayList<Integer>>ls,ArrayList<Integer>temp,int b,int index){
            if(b<0)
            return;
            if(b==0){
                if(!ls.contains(temp))
                ls.add(new ArrayList<>(temp));
            }
            else{
                for(int i=index;i<a.size();i++){
                    temp.add(a.get(i));
                    generate(a,ls,temp,b-a.get(i),i+1);
                    temp.remove(temp.size()-1);
                }
            }
        }
        public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
            ArrayList<ArrayList<Integer>>ls = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer>temp = new ArrayList<Integer>();
            Collections.sort(a);
            generate(a,ls,temp,b,0);
            return ls;
        }
    }
    
}