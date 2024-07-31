package com.backtraking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        //System.out.println(pathCount(3,3));
        //path("",3,3);
//        System.out.println(pathList("",3,3));
//        System.out.println();
        boolean [][]board ={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        pathRestrictions("",board,0,0);
    }
    public static int pathCount(int row,int col){
        // base condition
        if(row == 1 && col == 1){
            //goal is found
           return 1;
        }
        int left=0,right=0;
        if(row > 1){
            //(3,3) -> (2,3)->(1,3)
            left = pathCount(row-1,col);
        }
        if(col > 1){
            //(3,3) -> (3,2)->(3,1)
             right = pathCount(row,col-1);
        }
        return left+right;
    }

    public static void path(String p,int row,int col){
        // base condition
        if(row == 1 && col == 1){
            //goal is found
            System.out.println(p);
            return ;
        }

        if(row > 1){
            //(3,3) -> (2,3)->(1,3)
            path(p+'H',row-1,col);
        }
        if(col > 1){
            //(3,3) -> (3,2)->(3,1)
            path(p+'R',row,col-1);
        }

    }
    public static ArrayList<String> pathList(String p, int row, int col){
        // base condition
        if(row == 1 && col == 1){
            //goal is found
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(row>1 && col>1){
            // for diagonal move
            list.addAll(pathList(p+'D',row-1,col-1));
        }
        if(row > 1){
            //(3,3) -> (2,3)->(1,3)
            list.addAll(pathList(p+'H',row-1,col));
        }
        if(col > 1){
            //(3,3) -> (3,2)->(3,1)
            list.addAll(pathList(p+'R',row,col-1));
        }
       return list;
    }
    public static void pathRestrictions(String p,boolean [][]maze,int row,int col){
        // base condition
        if(row == maze.length-1 && col == maze[0].length-1){
            //goal is found
            System.out.println(p);
            return ;
        }
        if(!maze[row][col]){
            return;
        }
        if(row < maze.length-1){

            pathRestrictions(p+'H',maze,row+1,col);
        }
        if(col < maze[0].length-1){

            pathRestrictions(p+'R',maze,row,col+1);
        }

    }
}
