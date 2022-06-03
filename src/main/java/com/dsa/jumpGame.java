package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #45 - Jump Game II
 * look for a better solution this can be done in O(N) also look at commented code below
 */
public class jumpGame {
    public static void main(String[] args) {
        int[] nums={5,9,3,2,1,0,2,3,3,1};
       System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        int len=nums.length;
        int[] cArray= new int[len];
        cArray[len-1]=0;
        for(int i=len-2;i>=0;i--){
            jump(cArray,nums,i)  ;
        }
        return cArray[0];

    }
    public static void jump(int[] cArray,int[] nums,int i){
        int current=nums[i];
        int mincount=Integer.MAX_VALUE;
        for(int j=current;j>0;j--){
            if(i+j<nums.length && cArray[i+j]!=Integer.MAX_VALUE  ){
                mincount=Math.min(mincount,cArray[i+j]+1) ;
                if(mincount==1){
                    break;
                }
            }
        }
        cArray[i]=mincount;
    }

}
class Solution {
    public int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // we continuously find the how far we can reach in the current jump
            farthest = Math.max(farthest, i + nums[i]);
            // if we have come to the end of the current jump,
            // we need to make another jump
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }

    /*public int jump(int[] nums) {
        int jumps = 0, currentJumpEnd = 0, farthest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            // we continuously find the how far we can reach in the current jump
            farthest = Math.max(farthest, i + nums[i]);
            // if we have come to the end of the current jump,
            // we need to make another jump
            if (i == currentJumpEnd) {
                jumps++;
                currentJumpEnd = farthest;
            }
        }
        return jumps;
    }*/
}