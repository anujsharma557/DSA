package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #283 - Move Zeroes
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        Arrays.stream(nums).forEach(System.out::println);

    }
    public static void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j]=nums[i];
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            nums[i]=0;
        }
    }
}
