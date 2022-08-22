/** ****************************************************************************
 * reverseSentenceButNotReverseWords.java
 * Programmer: @author Kevin Bell
 * Version: 1.0
 * Course: SDEV 2220
 * This program practices the use of recursion
 **************************************************************************** */
package printreversemessagerecursive;

import java.util.Scanner;

public class reverseSentenceButNotReverseWords {

    public static void main(String[] args) {
        System.out.println("Ch 11 Strings by Kevin Bell \n");
        String message = new String("We Are Many");
        Scanner scan = new Scanner(message);
        //recursive method to reverse words in string
        System.out.println("Part 1, recursive method");
        System.out.println(getReverse(scan));
        System.out.println();
        //iterative method to reverse words in string
        System.out.println("Part 2, iterative processing");
        getRearrange();
    } // end main method

    private static String getReverse(Scanner scan) {
        String nextWord;
        //recursive here
        nextWord = scan.next();
        if (scan.hasNext()) {                             //stopping condition
            nextWord = getReverse(scan) + " " + nextWord; //base case
        } // end if statement
        return nextWord;
    } //end method getReverse

    private static void getRearrange() {
        String sentence = "We Are Many";
        String[] splitSentence = sentence.split(" ");
        // using a StringBuilder for performance improvements
        StringBuilder reversedSentence = new StringBuilder();
        // append to StringBuilder in reverse order.
        for (int i = splitSentence.length - 1; i >= 0; i--) {
            reversedSentence.append(splitSentence[i]).append(" ");
        } // end for loop
        System.out.println(reversedSentence.toString());
    } // end method getRearrange
} // end reverseSentenceButNotReverseWords class
