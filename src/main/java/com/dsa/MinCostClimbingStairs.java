package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #746 - Min Cost Climbing Stairs
 */
public class MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost={10,15,20};
        System.out.println(minCostClimbingStairs(cost));
    }

    public static int minCostClimbingStairs(int[] cost) {


        if(cost.length==1){
            return cost[0];
        }
        if(cost.length==2){
            return Math.min(cost[0],cost[1]);
        }
        int currentCost[] = new int[cost.length + 1];
        int nearStep=0;
        int farStep=0;
        for(int i=2;i<currentCost.length;i++){
            farStep=currentCost[i-2]+cost[i-2];
            nearStep=currentCost[i-1]+cost[i-1];
            currentCost[i]=Math.min(nearStep,farStep);

        }
        return currentCost[currentCost.length - 1];


    }

}
