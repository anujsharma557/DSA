package main.java.com.dsa;

public class Rotate2DArray {
    public static void main(String args[]) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArr(arr);
        System.out.println("");
        rotateArray(arr);
    }

    private static void rotateArray(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r / 2; i++) {
            int start=i;
            int end= r-i-1;
            for (int j = start; j < end; j++) {
                int temp = arr[start][j];
                arr[start][j] = arr[end - j + start][start];
                arr[end - j - start][start] = arr[end][end-j+start];
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
