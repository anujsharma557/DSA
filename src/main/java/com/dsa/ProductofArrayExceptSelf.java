package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #238 - Product of Array Except Self
 */
public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        Arrays.stream(productExceptSelf(nums)).forEach(System.out::println);
    }
    public static int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        res[0]=1;
        for(int i=1;i<nums.length;i++){
            res[i]=res[i-1]*nums[i-1];
        }
        int var=1;
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=var;
            var=var*nums[i];
        }
        return res;
    }
}
