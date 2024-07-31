package com.backtraking;

import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean [][]board ={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int [][]paths = new int[board.length][board[0].length];
        allPathsPrint("",board,0,0,paths,1);
    }
    public static void allPaths(String p,boolean [][]maze,int row,int col){
        // base condition
        if(row == maze.length-1 && col == maze[0].length-1){
            //goal is found
            System.out.println(p);
            return ;
        }
        if(!maze[row][col]){
            return;
        }
        // i am considering this block in my path
        maze[row][col] = false;
        if(row < maze.length-1){

            allPaths(p+'D',maze,row+1,col);
        }
        if(col < maze[0].length-1){

            allPaths(p+'R',maze,row,col+1);
        }

        if(row>0){

            allPaths(p+'U',maze,row-1,col);
        }
        if(col > 0){

            allPaths(p+'L',maze,row,col-1);
        }
        // this line where the function will bw over
        // so before the function get removed , also remove the changes that were made by that function
        maze[row][col] = true;
    }

    public static void allPathsPrint(String p,boolean [][]maze,int row,int col,int [][]paths,int step){
        // base condition
        if(row == maze.length-1 && col == maze[0].length-1){
            //goal is found
            paths[row][col] = step;
            for (int [] a:paths) {
                System.out.println(Arrays.toString(a));
            }
            System.out.println(p);
            System.out.println();
            return ;
        }
        if(!maze[row][col]){
            return;
        }
        // i am considering this block in my path
        maze[row][col] = false;
        paths[row][col] = step;
//        if(row < maze.length-1 && col < maze[0].length-1){
//            // for diagonal move
//            allPathsPrint(p+'D',maze,row+1,col+1,paths,step+1);
//        }
        if(row < maze.length-1){

            allPathsPrint(p+'H',maze,row+1,col,paths,step+1);
        }
        if(col < maze[0].length-1){

            allPathsPrint(p+'R',maze,row,col+1,paths,step+1);
        }

        if(row>0){

            allPathsPrint(p+'U',maze,row-1,col,paths,step+1);
        }
        if(col > 0){

            allPathsPrint(p+'L',maze,row,col-1,paths,step+1);
        }
        // this line where the function will bw over
        // so before the function get removed , also remove the changes that were made by that function
        maze[row][col] = true;
        paths[row][col] = 0;
    }
}
