package main.java.com.dsa;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #46 - Permutations
 * this code has complexity of O(N*N!)
 * follow the commented code for better complexity response
 */
public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        List<List<Integer>> res=permute(nums);
        res.stream().forEach(System.out::println);
    }
    public static List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        List<List<Integer>> res= new LinkedList<>();
        permute(res,nums,len-1,0);
        return res;
    }
    public static void permute(List<List<Integer>> res, int[] nums, int pos, int j){
        if(j==pos){
            res.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            return;
        }
        for(int i=j;i<=pos;i++){
            swap(nums,i,j);
            permute(res,nums,pos,j+1); // permute for the remaining array
            swap(nums,i,j);
        }
    }
    public static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }


   /* *//**
     * use simple loop and back track
     * have a global array visited to track a visited number
     * add the non - visited number to list
     * when the list is of same size as array add it to response
     * use linked list for maintaining sequence
     * this is faster than the swaping array approach above
     * @param nums
     * @return
     *//*
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        boolean[] visited = new boolean[nums.length];
        backtrack(list, result, nums, visited);
        return result;
    }

    private static void backtrack(LinkedList<Integer> list, List<List<Integer>> result,
                           int[] nums, boolean[] visited){
        if(list.size() == nums.length){
            result.add(new LinkedList<>(list));
            return;
        }
        for(int i=0; i< nums.length; i++){
            int n = nums[i];
            if(visited[i]){
                continue;
            }
            visited[i] = true;
            list.add(n);
            backtrack(list, result, nums, visited);
            list.removeLast();
            visited[i] = false;
        }
    }*/
}
