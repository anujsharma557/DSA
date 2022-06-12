package main.java.com.dsa;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #128 - Longest Consecutive Sequence
 * use set and iterate it for finding the longest sequence in O(N) time
 */
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums ={100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums ));
    }
    public static int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]) ;
        }

        int longestSeq=0;
        int localSeq=0;
        for (int num : map) {
            if(!map.contains(num-1)){
                localSeq=0;
                while(map.contains(num)){
                    localSeq++;
                    num++;
                }

                longestSeq=Math.max(longestSeq,localSeq)  ;
            }
        }
        return longestSeq;

    }
}
