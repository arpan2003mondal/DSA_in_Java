package com.dsa;

public class PatternQuestion {
    public static void main(String[] args) {

        pattern2(5);
        //pattern10(10);

    }
    public static void pattern1(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // run for each row and column
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // run for each row and column
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int row=0;row<n;row++){
            // this loop is the outer loop
            // run for each row and column
            for(int col=0;col<n-row;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // run for each row and column
            for(int col=1;col<=row;col++){
                System.out.print(col+" ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int row=1;row<=2*n-1;row++){
            // this loop is the outer loop
            // run for each row and column
            int lastColumn;
            if(row>n){
                lastColumn=2*n-row;
            }
            else {
                lastColumn=row;
            }
            for(int col=1;col<=lastColumn;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace=n-row;
           for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
           for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern7(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace=row-1;
            for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace=n-row;
            for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
           for(int col=1;col<=2*(row-1)+1;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern9(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace=row-1;
            for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
           for(int col=1;col<=2*(n-row)+1;col++){
                System.out.print("* ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern10(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace=n-row;
            for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
            for(int col=1;col<=row;col++){
                System.out.print("*   ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int row=1;row<=n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace=row-1;
            for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
            for(int col=1;col<=n-row+1;col++){
                System.out.print("*   ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int row=1;row<=2*n;row++){
            // this loop is the outer loop
            // this is for printing the whitespaces
            int totalSpace,totalStar;
            if(row>n){
                totalSpace=2*n-row;
                totalStar=row-n;
            }
            else{
                totalSpace=row-1;
                totalStar=n-row+1;
            }

            for(int i=1;i<=totalSpace;i++){
                System.out.print("  ");
            }
            for(int col=1;col<=totalStar;col++){
                System.out.print("*   ");
            }
            // after ecch row complete add a newline
            System.out.println();
        }
    }
}
