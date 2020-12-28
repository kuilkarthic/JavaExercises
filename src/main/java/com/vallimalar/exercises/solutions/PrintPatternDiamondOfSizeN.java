package com.vallimalar.exercises.solutions;

/**
 * Print the pattern as below for size 5
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
 *Print the pattern as below for size 9
 *
 *              *
 *             * *
 *            * * *
 *           * * * *
 *          * * * * *
 *         * * * * * *
 *        * * * * * * *
 *       * * * * * * * *
 *      * * * * * * * * *
 *       * * * * * * * *
 *        * * * * * * *
 *         * * * * * *
 *          * * * * *
 *           * * * *
 *            * * *
 *             * *
 *              *
 *
 * Print the pattern for size 30 and see magic
 *
 */
public class PrintPatternDiamondOfSizeN {
    public static void main (String[] args) {
        int n=30;

        for(int i=0;i<n;i++){
            for(int j=n;j>i;j--) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                if(k==i){
                    System.out.print("*");
                }else {
                    System.out.print("* ");
                }
            }
            for(int j=n;j>i;j--) {
                System.out.print(" ");
            }
            System.out.println();
        }
        // Inverted Triangle from here
        for(int i=1;i<n;i++) {
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                if(j == n - i - 1){
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
