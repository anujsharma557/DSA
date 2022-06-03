package main.java.com.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #39 - Combination Sum
 */
public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {1, 5, 6, 7, 8};
        int target = 7;
        combinationSum(candidates, target).forEach(System.out::println);
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        findCombination(candidates,res,curr,target,0);
        return res;
    }
    public static void findCombination(int[] candidates, List<List<Integer>> res, List<Integer> curr, int target, int start){
        if(target==0){
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            curr.add(candidates[i]);
            findCombination(candidates,res,curr,target-candidates[i],start++);// start is used to not repeat the previous traversed values in array
            // this will traverse the initial value multiple time and then increase value in next iterations
            curr.remove(curr.size()-1);
        }
    }
}
