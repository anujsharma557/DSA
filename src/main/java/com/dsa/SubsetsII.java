package main.java.com.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #90 - Subsets II
 */
public class SubsetsII {
    public static void main(String args[]){
        int[] nums = {1, 2, 2};
        List<List<Integer>> res=subsetsWithDup(nums);
        res.stream().forEach(System.out::println);
    }
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        combinations(res,curr,nums,0);
        return res;
    }
    public static void combinations(List<List<Integer>> res,List<Integer> curr,int[] nums,int start) {
        res.add(new ArrayList<>(curr));
        for(int i=start;i<nums.length;i++){
            if (i != start && nums[i] == nums[i - 1]) {
                continue;
            }
            curr.add(nums[i]);
            combinations(res,curr,nums,i+1);
            curr.remove(curr.size()-1);
        }
    }
}
