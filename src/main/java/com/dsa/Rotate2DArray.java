package main.java.com.dsa;

import java.util.Arrays;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #48 - Rotate Image
 */
public class Rotate2DArray {
    public static void main(String args[]) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(arr);
        Arrays.stream(arr).forEach(e->{
            Arrays.stream(e).forEach(System.out::print);
            System.out.println();
        });
    }

    public static void rotate(int[][] matrix) {
        int r=matrix.length;
        int c= matrix[0].length;
        int outerLoop=0;
        if(r/2==0){
            outerLoop=r/2;
        }else{
            outerLoop=r/2+1;
        }

        for(int i=0;i<outerLoop;i++){
            for(int j=i;j<c-i-1;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[c-1-j][i] ;
                matrix[c-1-j][i]=matrix[c-1-i][c-1-j];
                matrix[c-1-i][c-1-j]= matrix[j][c-1-i];
                matrix[j][c-1-i]=temp;
            }
        }
    }

    private static void rotateArray(int[][] arr) {
        int r = arr.length;
        for (int i = 0; i < r / 2; i++) {
            int start=i;
            int end= r-i-1;
            for (int j = start; j < end; j++) {
                int temp = arr[start][j];
                arr[start][j] = arr[end - j + start][start];
                arr[end - j + start][start] = arr[end][end-j+start];
                arr[end][end-j+start] = arr[j][end];
                arr[j][end] = temp;
            }
        }
        printArr(arr);

    }

    private static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
