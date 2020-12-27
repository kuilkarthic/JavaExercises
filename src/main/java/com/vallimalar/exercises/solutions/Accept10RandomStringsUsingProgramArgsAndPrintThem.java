package com.vallimalar.exercises.solutions;

/**
 * Accept a name as a program argument in String[] args to Exercise2Accept10RandomStringsUsingProgramArgsAndPrintThem and Greet the person like below.
 * if the Program arguments passed in were "Sun Moon Earth Mars Jupiter Saturn Neptune Pluto Mercury Venus", then the program should print
 * Hello Sun Moon Earth Mars Jupiter Saturn Neptune Pluto Mercury Venus!
 *
 *  * Tip: Program arguments can be passed in by going to
 *  *  1. Go to "Run -> Edit Run Configurations" in IntellijIdea
 *  *  2. Add a new run configuration - choosing the application template in the left box
 *  *  3. Give it an appropriate name and then choose java11 for the executable
 *  *  4. Choose the main class which would be Exercise2Accept10RandomStringsUsingProgramArgsAndPrintThem from the right package com.vallimalar.exercises.questions.Exercise2Accept10RandomStringsUsingProgramArgsAndPrintThem
 *  *  5. Enter 10 strings separated by spaces in the program arguments box and click on run
 */
public class Accept10RandomStringsUsingProgramArgsAndPrintThem {
    public static void main (String[] args) {
        for(int i=0;i<args.length;i++){
            System.out.print(args[i] + " ");
        }
    }
}
