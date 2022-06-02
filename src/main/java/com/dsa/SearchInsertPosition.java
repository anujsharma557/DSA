package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #35 - Search Insert Position
 * only difference is when the element is not in array return start pointer instead of -1
 */
public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 8};
        int find = 1;
        System.out.println(searchInsert(arr, find));
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                start= mid+1;
            }else{
                end= mid-1;
            }
        }
        return start;
    }
}
