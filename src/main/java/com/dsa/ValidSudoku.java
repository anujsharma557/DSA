package main.java.com.dsa;

import java.util.HashSet;

/**
 * @Author:sharma.anuj557@gmail.com
 * @Description: LeetCode #36 -  Valid Sudoku
 * time: O(N*N)
 * space: O(N*N)
 */
public class ValidSudoku {

    public static void main(String[] args) {
        char[][] board={{'5','3','.','.','7','.','.','.','.'}
                ,{'6','.','.','1','9','5','.','.','.'}
                ,{'.','9','8','.','.','.','.','6','.'}
                ,{'8','.','.','.','6','.','.','.','3'}
                ,{'4','.','.','8','.','3','.','.','1'}
                ,{'7','.','.','.','2','.','.','.','6'}
                ,{'.','6','.','.','.','.','2','8','.'}
                ,{'.','.','.','4','1','9','.','.','5'}
                ,{'.','.','.','.','8','.','.','7','9'}};
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        HashSet<Character> row[]= new HashSet[9];
        HashSet<Character> col[]= new HashSet[9];
        HashSet<Character> box[]= new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    char c=board[i][j];
                    if(row[i].contains(c)){
                        return false;
                    }else{
                        row[i].add(c);
                    }
                    if(col[j].contains(c)){
                        return false;
                    }else{
                        col[j].add(c);
                    }
                    int boxIndex= (i/3)*3+(j/3);

                    if(box[boxIndex].contains(c)){
                        return false;
                    }else{
                        box[boxIndex].add(c);
                    }
                }
            }
        }
        return true;

    }

}
