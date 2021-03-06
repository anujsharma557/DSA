package main.java.com.dsa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #73 - Set Matrix Zeroes O(N*N)
 *  there is another approach that has space complexity as O(N) follow commented code
 */
public class SetMatrixZeroes {
    public static void main(String[] args) {
        int [][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        setZeroes(matrix);
        Arrays.stream(matrix).forEach((i) -> {
            Arrays.stream(i).forEach((j) -> System.out.print(j + " "));
            System.out.println();
        });
    }
    public static void setZeroes(int[][] matrix) {
        int m= matrix.length;
        int n= matrix[0].length;
        Set<Integer> rows= new HashSet<>();
        Set<Integer> cols= new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows.contains(i) || cols.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /*public void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {

            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
            // We can use an additional variable for either the first row/column.
            // For this solution we are using an additional variable for the first column
            // and using matrix[0][0] for the first row.
            if (matrix[i][0] == 0) {
                isCol = true;
            }

            for (int j = 1; j < C; j++) {
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) {
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) {
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) {
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }*/
}
