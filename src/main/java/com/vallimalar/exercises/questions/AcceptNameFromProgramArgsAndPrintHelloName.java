package com.vallimalar.exercises.questions;

/**
 * Accept a name as a program argument in String[] args to Exercise3AcceptNameFromProgramArgsAndPrintHelloName and Greet the person like below.
 * if the Program argument passed in was "Vallimalar", then the program should print
 * Hello Vallimalar!
 *
 *  * Tip: Program arguments can be passed in by going to
 *  *  1. Go to "Run -> Edit Run Configurations" in IntellijIdea
 *  *  2. Add a new run configuration - choosing the application template in the left box
 *  *  3. Give it an appropriate name and then choose java11 for the executable
 *  *  4. Choose the main class which would be Exercise3AcceptNameFromProgramArgsAndPrintHelloName from the right package com.vallimalar.exercises.questions.Exercise3AcceptNameFromProgramArgsAndPrintHelloName
 *  *  5. Enter your name in the program arguments box and click on run
 */
public class AcceptNameFromProgramArgsAndPrintHelloName {
    public static void main (String[] args) {
        System.out.println("Hello " + args[0] + "!");
    }
}
