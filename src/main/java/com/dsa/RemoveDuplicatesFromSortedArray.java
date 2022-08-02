package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #26 - Remove Duplicates from Sorted Array
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {

        int p1=0;
        int p2=1;
        while(p2<nums.length){

            if(nums[p1]!=nums[p2]){
                p1++;
                nums[p1]=nums[p2];
                p2++;
            }else{
                p2++;
            }
        }
        return p1+1;
    }
}
