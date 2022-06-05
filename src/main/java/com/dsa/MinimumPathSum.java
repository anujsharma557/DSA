package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #64 - Minimum Path Sum
 * Complexity: O(N*N)
 * commented code below solves this problem using one D array, this improves space complexity but time complexity still remains same
 *
 */
public class MinimumPathSum {
    public static void main(String[] args) {
        int [][]grid = {{1,3,1},{1,5,1},{4,2,1}};
        System.out.println(minPathSum(grid));
    }
    public static int minPathSum(int[][] grid) {
        int m= grid.length;
        int n= grid[0].length;
        int min=Integer.MAX_VALUE;
        int[][] sum=new int[m][n];
        sum[0][0]=grid[0][0];
        return findMinPath(grid,sum,m,n);

    }
    public static int findMinPath(int[][] grid,int[][] sum,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0 && j-1>=0){
                    sum[i][j]=grid[i][j]+Math.min(sum[i-1][j],sum[i][j-1]) ;
                }else if(i-1<0){
                    sum[i][j]=j-1<0?grid[i][j]:grid[i][j]+sum[i][j-1];
                }else{
                    sum[i][j]=i-1<0?grid[i][j]:grid[i][j]+sum[i-1][j];
                }
            }
        }
        return sum[m-1][n-1];
    }

    /*public int minPathSum(int[][] grid) {
        int[] dp = new int[grid[0].length];
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                if(i == grid.length - 1 && j != grid[0].length - 1)
                    dp[j] = grid[i][j] +  dp[j + 1];
                else if(j == grid[0].length - 1 && i != grid.length - 1)
                    dp[j] = grid[i][j] + dp[j];
                else if(j != grid[0].length - 1 && i != grid.length - 1)
                    dp[j] = grid[i][j] + Math.min(dp[j], dp[j + 1]);
                else
                    dp[j] = grid[i][j];
            }
        }
        return dp[0];
    }*/
}
