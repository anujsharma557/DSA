package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: maximum contiguous sum in an array
 */
public class MaximumSumOfSubArray{
    public static void main(String[] args) {
        int[] a={1,-3,4,-2,-2,6};
        int sum=maximumSumOfSubArray(a);
        System.out.println("maxSum:"+sum);
    }

    private static int maximumSumOfSubArray(int[] a) {
        int len= a.length;
        int sum=0;
        int maxSum=a[0];
        for(int i=0;i<len;i++){
            sum= Math.max(sum+a[i],a[i]);
            maxSum=Math.max(sum,maxSum);
        }
        return maxSum;

    }
}
