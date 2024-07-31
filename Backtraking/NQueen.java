package com.backtraking;

public class NQueen {
    public static void main(String[] args) {
        int n = 4;
        boolean board[][] = new boolean[n][n];

        System.out.println(queens(board,0));
    }

    public static int queens(boolean [][]board,int row){
        if(row == board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        // placaing the queen and checking if each row,col is safe
        for( int col = 0;col < board.length;col++){
            // check if safe to place queen
            if(isSafe(board,row,col)){
                board[row][col] = true;
                count += queens(board,row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean [][]board,int row, int col) {
        // checking vertical row
        for(int i = 0;i < row ;i++){
            if(board[i][col]){
                return false;
            }
        }

        // checking left diagonal
        int maxLeft = Math.min(row,col);

        for( int i = 1; i <= maxLeft;i++){
           if( board[row-i][col-i]){
               return false;
           }
        }

        // checking right diagonal
        int maxRight = Math.min(board.length-col-1, row );
        for(int i=1; i<=maxRight;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {
        for(boolean []rows :board){
            for (boolean ele: rows) {
                if(ele){
                    System.out.print("Q ");
                }
                else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
