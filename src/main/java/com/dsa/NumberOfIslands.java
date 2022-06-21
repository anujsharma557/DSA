package main.java.com.dsa;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #200 - Number of Islands
 */
public class NumberOfIslands {
    public static void main(String[] args) {
        char [][] grid = {{'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                         {'0','0','0','1','0'}};
        System.out.println(numIslands(grid));
    }
    // this uses DFS which is less efficient than BFS in case of very big matrix
    public static int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int numberofIsland=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    numberofIsland++;
                    dfs(grid,i,j,m,n);
                }
            }
        }
        return numberofIsland;
    }
    public static void dfs(char[][] grid,int i,int j,int m,int n){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]=='0'){
            return;
        }
        grid[i][j]='0';
        dfs(grid,i-1,j,m,n);
        dfs(grid,i,j-1,m,n);
        dfs(grid,i+1,j,m,n);
        dfs(grid,i,j+1,m,n);
    }

    // BFS approach
    /*public static int numIslands(char[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int numberOfisland=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    numberOfisland++;
                    Queue<Integer> queue= new LinkedList<>();
                    int id= i*n+j;
                    queue.offer(id);
                    grid[i][j]='0';
                    while(!queue.isEmpty()){
                        id=queue.poll();
                        int row=id/n;
                        int col=id%n;

                        if(row-1>=0 && grid[row-1][col]=='1'){
                            grid[row-1][col]='0';
                            queue.offer((row-1)*n+col);
                        }
                        if(row+1<m && grid[row+1][col]=='1'){
                            grid[row+1][col]='0';
                            queue.offer((row+1)*n+col);
                        }
                        if(col-1>=0 && grid[row][col-1]=='1'){
                            grid[row][col-1]='0';
                            queue.offer(row*n+(col-1));
                        }
                        if(col+1<n && grid[row][col+1]=='1'){
                            grid[row][col+1]='0';
                            queue.offer(row*n+(col+1));
                        }
                    }
                }

            }
        }
        return numberOfisland;
    }*/

}
