package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #189 - Rotate Array
 */
public class RotateArray {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        int k=3;
        rotate(nums,k);
        Arrays.stream(nums).forEach(System.out::print);
    }
    public static void rotate(int[] nums, int k) {
        k=k % nums.length;
        int count=0;
        for(int i=0;count < nums.length; i++){
            int currloc=i;
            int curr=nums[i];
            do{
                int nextloc= (currloc+k) % nums.length;
                int temp=nums[nextloc];
                nums[nextloc] = curr;
                curr = temp;
                currloc = nextloc;
                count++;
            } while(i!=currloc);
        }
    }
}
