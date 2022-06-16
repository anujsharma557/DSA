package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #152. Maximum Product Subarray
 */
public class MaximumProductSubArray {
    public static void main(String[] args) {
        int[] prices={2,3,-2,4};
     System.out.println(maxProduct(prices));
    }
    public static int maxProduct(int[] nums) {
        int[] minArr= new int[nums.length];
        int[] maxArr= new int[nums.length];
        minArr[0]=nums[0];
        maxArr[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            minArr[i]=Math.min(nums[i],Math.min(minArr[i-1]*nums[i],maxArr[i-1]*nums[i]));
            maxArr[i]=Math.max(nums[i],Math.max(minArr[i-1]*nums[i],maxArr[i-1]*nums[i]));
            max=Math.max(max,Math.max(minArr[i],maxArr[i]));
        }
        return max;
    }
}
