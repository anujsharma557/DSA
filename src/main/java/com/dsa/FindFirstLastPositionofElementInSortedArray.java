package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description:
 */
public class FindFirstLastPositionofElementInSortedArray {
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        Arrays.stream(searchRange(arr,target)).forEach(System.out::print);
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] res= new int[2];
        int start= search(nums,0,nums.length-1,target,true);
        if(start==-1){
            res[0]=-1;
            res[1]=-1;
            return res;
        }
        int end= search(nums,0,nums.length-1,target,false);
        res[0]=start;
        res[1]=end;
        return res;

    }
    public static int search(int[] nums ,int start,int end,int target,boolean getFirst){

        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]==target){
                if(getFirst){
                    if(mid == start || nums[mid-1]!=target){
                        return mid;
                    }
                    end=mid-1;

                }else{
                    if(mid == end || nums[mid+1]!=target){
                        return mid;
                    }
                    start=mid+1;
                }


            }else if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
