package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #215 - Kth Largest Element in an Array
 * Complexity O(N)
 */
public class KthLargestElementInArray {
    public static void main(String[] args) {
        int[] nums= {3,2,1,5,6,4};
        int k=2;
        System.out.println(findKthLargest(nums,k));
    }
    public static int findKthLargest(int[] nums, int k) {
        return find(nums,nums.length-k,0,nums.length-1);

    }
    private static int find(int[] nums, int k,int start,int end){
        if(start<=end){
            int partitionPos=partition(nums,start,end);
            if(partitionPos==k){
                return nums[partitionPos];
            }
            if(partitionPos>k){
                return find(nums,k,start,partitionPos-1);
            }
            else{
                return find(nums,k,partitionPos+1,end);
            }
        }else{
            return -1;
        }
    }
    public static int partition(int[] nums,int start,int end){
        int left=start;
        int right=end;
        int pivot=nums[left];

        while(left<right){
            while(left<nums.length-1  &&  nums[left]<=pivot){
                left++;
            }
            while(right>0 && nums[right]>pivot){
                right--;
            }
            if(left<right){
                swap(nums,left,right);
            }
        }

        nums[start]=nums[right];
        nums[right]=pivot;
        return right;
    }

    private static void swap(int[] nums,int left,int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
