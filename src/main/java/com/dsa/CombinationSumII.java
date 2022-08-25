package main.java.com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #40 - Combination Sum II
 */
public class CombinationSumII {
    public static void main(String[] args) {
        int[] candidates = {1,1,1,1,1,1,1,1,1,1,1,1};
        int target = 7;
        combinationSum2(candidates, target).forEach(System.out::println);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> combo= new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates,target,res,combo,0);
        return res;

    }
    public static void combinationSum2(int[] candidates, int target,List<List<Integer>> res,List<Integer> combo,int start) {
        if(target==0 && !res.contains(combo)){
            res.add(new ArrayList(combo));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=start;i<candidates.length;i++){
            // this condition is to make sure that the number at same position is not same as previous number
            // skip numbers that satisfy below condition
            if(i>start && candidates[i]==candidates[i-1]){
                continue;
            }
            combo.add(candidates[i]);
            combinationSum2(candidates,target-candidates[i],res,combo,i+1);
            combo.remove(combo.size()-1);
        }


    }
}
