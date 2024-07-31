package com.backtraking;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int n = 4;

        boolean board[][] = new boolean[n][n];

        //System.out.println(queens(board,0));
        knights(board,0,0,4);
    }

    public static void knights(boolean [][] board,int row,int col,int knight){
        if(knight == 0){
            display(board);
            System.out.println();
            return;
        }

        if(row == board.length-1 && col == board.length){
            return;
        }
        if(col == board.length){
            knights(board,row+1,0,knight);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col] = true;
            knights(board,row,col+1,knight-1);
            board[row][col] = false;
        }

        knights(board,row,col+1,knight);

    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(inRange(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(inRange(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(inRange(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(inRange(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }

        return true;
    }

    private static boolean inRange(boolean[][] board, int row, int col) {
        if(row>=0 && row < board.length && col>=0 && col < board.length){
            return true;
        }
        return false;
    }


    public static void display(boolean[][] board) {
        for(boolean []rows :board){
            for (boolean ele: rows) {
                if(ele){
                    System.out.print("K ");
                }
                else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
