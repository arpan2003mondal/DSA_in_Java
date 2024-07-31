package com.backtraking;

import java.util.Arrays;

public class SudokoSolver {
    public static void main(String[] args) {
        int [][]board = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}
        };
      if(isSolve(board)){
          display(board);
      }
      else {
          System.out.println("Cannot solve Sudoko");
      }
    }

    private static void display(int[][] board) {
        for(int []rows :board){
            System.out.println(Arrays.toString(rows));
        }
    }

    public static boolean isSolve(int [][]board){
        int n = board.length;
        int row = -1;
        int col = -1;

        boolean emptyLeft = true;
        // finding empty cell
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if(board[i][j] == 0){
                    // empty cell found
                    row=i;
                    col=j;
                    emptyLeft = false;
                    break;
                }
            }
             //if you found any empty cell then break
            if(!emptyLeft){
                break;
            }
        }
        if(emptyLeft){
            // suduko is solved
            return true;
        }

        // placing the empty cells with right num
        // backtrack
        for(int number = 1;number<=9;number++){
            if(isSafe(board,row,col,number)){
                board[row][col] = number;
                if(isSolve(board)){
                    // sudoko is solved
                    return true;
                }
                else {
                    // backtrack
                    board[row][col] = 0;
                }
            }
        }

        // cannot be solved
        return false;
    }

    public static boolean isSafe(int [][]board,int row,int col,int num) {
        // checking for the row
        for (int i = 0; i < board.length; i++) {
            // checking if the number is in the row
            if (board[row][col] == num) {
                return false;
            }
        }
        // checking for the col
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }

        // checking the box
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int i = rowStart; i < rowStart + sqrt; i++) {
            for (int j = colStart; j < colStart; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    }


