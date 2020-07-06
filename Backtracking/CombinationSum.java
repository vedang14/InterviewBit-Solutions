package Backtracking;

import java.util.ArrayList;

public class CombinationSum {
     static class Solution {
        public static void combinations(ArrayList<Integer> list,ArrayList<ArrayList<Integer>> ls, ArrayList<Integer> temp,int index, int B){
            if(B<0)
            return ;
            if(B==0)
            {
                if(!ls.contains(temp))
                ls.add(new ArrayList<>(temp));

            }
            else{
                for(int i=index;i<list.size();i++){
                    temp.add(list.get(i));
                    combinations(list,ls,temp,i,B-list.get(i));

                    temp.remove(list.size()-1);
                }
            }
        }
        public static ArrayList<ArrayList<Integer>> generate(ArrayList<Integer> list, int B) {
            ArrayList<ArrayList<Integer>> ls = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> temp = new ArrayList<>();
            combinations(list,ls,temp,0,B);
            return ls;
        }
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(4);
        int B = 4;
        System.out.println(Solution.generate(list, B));
    }
}