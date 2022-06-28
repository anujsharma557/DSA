package main.java.com.dsa;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description:  LeetCode #239 - Sliding Window Maximum
 */
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        Arrays.stream(maxSlidingWindow(nums,k)).forEach(System.out::println);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] res= new int[nums.length-k+1];
        Deque<Integer> deque = new LinkedList<>();
        for(int i=0;i<k;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }

        res[0]=nums[deque.peekFirst()];

        for(int i=k;i<nums.length;i++){
            while(!deque.isEmpty() && nums[deque.peekLast()]<nums[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
            while(!deque.isEmpty() && i-k>=deque.peekFirst()){
                deque.pollFirst();
            }
            res[i-k+1]=nums[deque.peekFirst()];
        }
        return res;
    }

}
