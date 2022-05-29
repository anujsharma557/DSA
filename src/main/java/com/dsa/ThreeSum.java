package main.java.com.dsa;

import java.util.*;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #15 - 3Sum
 * All test cases passed but need further improvement in performance
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        List<List<Integer>> res=threeSum(nums);
        res.stream().forEach(System.out::println);
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<nums.length-1; i++){
            if (i == 0 || nums[i - 1] != nums[i]) {
                res.addAll(find2Sum(i,nums));
            }
        }
        return res;

    }
    private static List<List<Integer>> find2Sum(int i,int[] nums){
        int mid=i+1;
        int right=nums.length-1;
        List<Integer> triplet=new ArrayList<>();
        Set<List<Integer>> triplets;
        triplets = new HashSet<>();
        while(mid<right){
            int sum= nums[i]+nums[mid]+nums[right];
            if(sum<0){
                mid++;
            }else if(sum>0){
                right--;
            }else{
                triplet = Arrays.asList(nums[i], nums[mid],nums[right]);
                triplets.add(triplet);
                mid++;
            }
        }
        return new ArrayList<>(triplets);
    }
}
