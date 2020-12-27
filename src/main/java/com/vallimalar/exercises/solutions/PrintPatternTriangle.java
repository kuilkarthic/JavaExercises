package com.vallimalar.exercises.solutions;

/**
 * Print the pattern as below
 *
 *              *
 *             * *
 *            * * *
 *           * * * *
 *          * * * * *
 *
 */
public class PrintPatternTriangle {
    public static void main (String[] args) {
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                if(k==i){
                    System.out.print("*");
                }else {
                    System.out.print("* ");
                }
            }
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
