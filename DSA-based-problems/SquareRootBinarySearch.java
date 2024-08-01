package com.dsa;

public class SquareRootBinarySearch {
    public static void main(String[] args) {
        int n= 40;
        int p=3; // p is taken for precision point
        System.out.println(getSqrt(n,p));
    }

    private static double getSqrt(int n,int p) {
        int start=0;
        int end=n;
        double root=0.0;
        int mid=0;
        // for finding integer part
        while(start<=end){
             mid= start+(end-start)/2;
            if(mid*mid==n){

                return root;
            } else if (mid*mid>n) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        root=mid-1;
        System.out.println(root);

        // for finding the decimal part

        double incre = 0.1;
        for(int i=0;i<p;i++){
            while (root*root<=n){
                //System.out.println(root);
                root+=incre;
            }
           root-=incre;
            incre /=10;
        }





        return root;
    }

}
