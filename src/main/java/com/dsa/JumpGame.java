package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #55 - Jump Game
 * The current approach gives O(N2) complexity
 * Refer commented code for best complexity O(N)
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        boolean[] cj=new boolean[nums.length];
        int last=nums.length-1;
        cj[last]=true;
        for(int i=last-1; i>=0;i--){
            if(nums[i]==0){
                cj[i]=false;
            }else{
                int start=i+1;
                for(int j=start;j<nums.length && j<=i+nums[i];j++){
                    if(cj[j]==true){
                        cj[i]=true;
                        break;
                    }
                }
            }
        }
        return cj[0];
    }

    /**
     * Update the value of goodIndicator that is in range
     * the goodIndicator always represent the position from which array end can be reached
     * if the goodIndicator falls in range of current step then update its value to current value;
     * @param nums
     * @return
     */
    /*public boolean canJump(int[] nums) {
        int last=nums.length-1;
        int goodIndicator=last;

        for(int i=last-1; i>=0;i--){
            if(i+nums[i]>=goodIndicator){
                goodIndicator=i;
            }
        }

        return goodIndicator==0;
    }*/
}
