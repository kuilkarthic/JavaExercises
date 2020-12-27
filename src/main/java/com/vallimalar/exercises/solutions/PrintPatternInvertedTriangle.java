package com.vallimalar.exercises.solutions;
/**
 * Print the pattern as below
 *
 *          * * * * *
 *           * * * *
 *            * * *
 *             * *
 *              *
 *
 */
public class PrintPatternInvertedTriangle {
    public static void main (String[] args) {
        for(int i=0;i<5;i++) {
            for (int k = 0; k < i; k++) {
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
