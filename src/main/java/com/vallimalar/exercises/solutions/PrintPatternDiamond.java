package com.vallimalar.exercises.solutions;

/**
 * Print the pattern as below
 *
 *              *
 *             * *
 *            * * *
 *           * * * *
 *          * * * * *
 *           * * * *
 *            * * *
 *             * *
 *              *
 *
 */
public class PrintPatternDiamond {
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
        // Inverted Triangle from here
        for(int i=1;i<5;i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 5 - i; j++) {
                if(j == 5 - i - 1){
                    System.out.print("*");
                }else {
                    System.out.print("* ");
                }
            }
            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
