package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #31 - Next Permutation
 */
public class NextPermutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        nextPermutation(nums);
        Arrays.stream(nums).forEach(System.out::print);
    }
    public static void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i+1]<=nums[i]){
            i--;
        }
        if(i>=0){
            int j= nums.length-1;
            while( j>=0 && nums[i]>=nums[j]){
                j--;
            }
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);

    }
    public  static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }

    }
}
