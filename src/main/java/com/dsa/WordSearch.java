package main.java.com.dsa;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #79 - Word Search
 */
public class WordSearch {
    public static void main(String[] args) {
        char[][]board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        System.out.println(exist(board,word));
    }

    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;
        int wordIndex=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(exist(board,word,i,j,wordIndex)){
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean exist(char[][] board, String word, int i, int j,int wordIndex){

        if(wordIndex>=word.length()){
            return true;
        }
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j] != word.charAt(wordIndex) ){
            return false;
        }
        board[i][j]='&';
        boolean returned=false;
        if(exist(board,word,i,j+1,wordIndex+1) ){
            return true;
        }
        if(exist(board,word,i+1,j,wordIndex+1)  ){
            return true;
        }
        if(exist(board,word,i,j-1,wordIndex+1)  ){
            return true;
        }
        if(exist(board,word,i-1,j,wordIndex+1) ){
            return true;
        }
        board[i][j]=word.charAt(wordIndex);

        return false;

    }
}
