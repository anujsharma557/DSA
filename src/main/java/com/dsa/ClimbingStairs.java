package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description:  LeetCode #70 - Climbing Stairs
 * this is a fibonacci type of code
 */
public class ClimbingStairs {
    public static void main(String[] args) {
       int n=4;
        System.out.println(climb(n));
    }
    public static int climb(int n) {
        if(n==1){
            return 1;
        }
        int[]arr= new int[n+1];
        arr[1]=1;
        arr[2]=2;
        for(int i=3;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }
}
