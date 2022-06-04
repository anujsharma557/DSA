package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #53 - Maximum Subarray
 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max=nums[0];
        int localmax=nums[0];
        for(int i=1;i<nums.length;i++){
            localmax=Math.max(nums[i],localmax+nums[i]);
            max=Math.max(max,localmax);
        }
        return max;
    }
}
