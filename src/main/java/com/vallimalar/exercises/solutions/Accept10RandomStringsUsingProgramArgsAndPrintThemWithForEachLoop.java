package com.vallimalar.exercises.solutions;

/**
 * Same as Exercise 2, but print them with a for each loop.
 */
public class Accept10RandomStringsUsingProgramArgsAndPrintThemWithForEachLoop {
    public static void main (String[] args) {
        for (String arg : args) {
            System.out.print(arg + " ");
        }
    }
}
