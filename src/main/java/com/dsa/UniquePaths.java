package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #62 - Unique Paths O(N*N)
 */
public class UniquePaths {
    public static void main(String[] args) {
        int m=3;
        int n=7;
        System.out.println(uniquePaths(m,n));
    }
    public static int uniquePaths(int m, int n) {
        int [][] path= new int[m][n];
        return paths(path,m,n);

    }

    public static int paths(int [][]path,int m,int n){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i-1>=0 && j-1>=0){
                    path[i][j]=path[i-1][j]+path[i][j-1];
                }else if(i-1<0 || j-1<0){
                    path[i][j]=1;
                }
            }

        }
        return path[m-1][n-1];
    }
}
