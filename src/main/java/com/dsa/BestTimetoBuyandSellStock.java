package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #121 - Best Time to Buy and Sell Stock
 * find min and max difference in single iteration
 */
public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxDiff=0;

        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                maxDiff=Math.max(maxDiff,prices[i]-min);
            }
        }
        return maxDiff;
    }
}
