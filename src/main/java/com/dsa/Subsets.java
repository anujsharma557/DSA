package main.java.com.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #78 - Subsets
 * two loops will be used , first one to decide the subset size
 * other loop will be used in backtracking
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<=nums.length;j++){
            findSubset(res,list,nums,j,0);
        }
        return new ArrayList<>(res);

    }
    public void findSubset(List<List<Integer>> res, List<Integer> list,int[]  nums, int outerloop,int startfrom){
        if(list.size()==outerloop){
            res.add(new ArrayList<>(list));
            return;
        }

        for(int i=startfrom;i<nums.length;i++){
            list.add(nums[i]);
            findSubset(res,list,nums,outerloop,i+1); // i+1 will allow to backtrack from next number
            list.remove(list.size()-1);
        }

    }
}
