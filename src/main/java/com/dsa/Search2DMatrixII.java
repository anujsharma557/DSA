package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #240 - Search a 2D Matrix II
 */
public class Search2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 4;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m= matrix.length-1;
        int n= 0;


        while(m>=0 && n<matrix[0].length){
            if(matrix[m][n]==target){
                return true;
            }else if(matrix[m][n]>target){
                m--;
            }else if(matrix[m][n]<target){
                n++;
            }

        }
        return false;

    }
}
