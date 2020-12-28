package com.vallimalar.exercises.solutions;

/**
 * Accept two numbers from program args and add them and print
 * Tip: args[0] is just a String. You need to get an integer from it to then be able to add or subtract. use Integer.parseInt to parse args[0] and get an integer.
 */
public class AcceptTwoNumbersUsingProgramArgsAndPrintTheirSum {
    public static void main (String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        System.out.println(i+j);
    }
}
