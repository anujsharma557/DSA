package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #74 - Search a 2D Matrix
 */
public class SearchA2DMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target=3;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n= matrix[0].length;
        int x=m-1;
        for(int i=0;i<m;i++){
            if(matrix[i][0]==target){
                return true;
            }else
            if(matrix[i][0]>target){
                if(i==0){
                    return false;
                }else{
                    x=i-1;
                    break;
                }

            }
        }
        for(int j=1;j<n;j++){
            if(matrix[x][j]==target){
                return true;
            }
        }
        return false;

    }
}
