package main.java.com.dsa;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: Leetcode#300 - Longest Increasing Subsequence
 * dynamic programming has O(N^2) complexity
 * check another approach below for O(N.log(N)) time complexity
 */
public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums={10,9,2,5,3,7,101,18};
        System.out.println(lengthOfLIS(nums));
    }
    public static int lengthOfLIS(int[] nums) {
        int [] dp= new int[nums.length];
        Arrays.fill(dp,1);
        int longest=0;
        for(int i=1;i<nums.length;i++){
            for (int j = 0; j < i; j++) {
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }

        }
        for (int c: dp) {
            longest = Math.max(longest, c);
        }
        return longest;
    }
     //O(N.log(N)) time complexity
    /*public static int lengthOfLIS(int[] nums) {
        ArrayList<Integer> sub = new ArrayList<>();
        sub.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > sub.get(sub.size() - 1)) {
                sub.add(num);
            } else {
                int j = binarySearch(sub, num);
                sub.set(j, num);
            }
        }

        return sub.size();
    }

    private static int binarySearch(ArrayList<Integer> sub, int num) {
        int left = 0;
        int right = sub.size() - 1;
        int mid = (left + right) / 2;

        while (left < right) {
            mid = (left + right) / 2;
            if (sub.get(mid) == num) {
                return mid;
            }

            if (sub.get(mid) < num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }*/
}
