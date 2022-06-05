package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #75 - Sort Colors
 */
public class SortColors {
    public static void main(String[] args) {
        int[] nums={2,0,2,1,1,0};
        sortColors(nums);
        Arrays.stream(nums).forEach(System.out::print);
    }
    public static void sortColors(int[] nums) {
        int left=-1;
        int mid=0;
        int right=nums.length-1;
        while(mid<=right){
            if(nums[mid]==0){
                left++;
                nums[mid]=nums[left];
                nums[left]=0;

                mid++;
            }else if(nums[mid]==2){
                nums[mid]=nums[right];
                nums[right]=2;
                right--;

            }else{
                mid++;
            }
        }
    }
}
