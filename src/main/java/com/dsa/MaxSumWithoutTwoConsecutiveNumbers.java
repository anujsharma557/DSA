package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: Max Sum Without Two Consecutive Numbers
 */
public class MaxSumWithoutTwoConsecutiveNumbers {
    public static void main(String[] args) {
        int[] a={0,-3,4,-2,-2,6};
        int sum=maxSumWithoutTwoConsecutiveNumbers(a);
        System.out.println("maxSum:"+sum);
    }

    private static int maxSumWithoutTwoConsecutiveNumbers(int[] a) {
        int sum[]=new int[a.length];
         sum[0]=a[0];
         sum[1]=Math.max(sum[0],a[1]);
        for(int i=2;i<a.length;i++){
            sum[i]=Math.max(sum[i-1],sum[i-2]+a[i]);
        }
        return sum[a.length-1];
    }
}
