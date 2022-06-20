package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #198 - House Robber
 */
public class HouseRobber {
    public static void main(String[] args) {
        int[] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int sum[]= new int[nums.length];
        if(nums.length==1){
            return nums[0];
        }
        sum[0]=nums[0];
        sum[1]=Math.max(nums[1],sum[0]);
        int max=Math.max(sum[1],sum[0]);
        for(int i=2;i<nums.length;i++){
            sum[i]=Math.max(nums[i]+sum[i-2],sum[i-1]);
            max= Math.max(max,sum[i]);
        }
        return max;
    }
}
