package main.java.com.dsa;


/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode#287 - Find the Duplicate Number
 * New approach to be practiced again
 */
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums={1,3,4,2,2};
       System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {// Find the intersection point of the two runners.
        int tortoise = nums[0];
        int hare = nums[0];

        do {
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
        } while (tortoise != hare);

        // Find the "entrance" to the cycle.
        tortoise = nums[0];

        while (tortoise != hare) {
            tortoise = nums[tortoise];
            hare = nums[hare];
        }

        return hare;
    }
}
