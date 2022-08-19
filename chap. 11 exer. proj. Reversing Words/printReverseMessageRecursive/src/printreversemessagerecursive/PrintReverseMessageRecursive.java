package printreversemessagerecursive;

import java.util.Scanner;

public class PrintReverseMessageRecursive {

    public static void main(String[] args) {
        System.out.print("Ch 11 Strings by Kevin Bell \n");
        String message = new String("We Are Many");
        Scanner scan = new Scanner(message);
        String reversedMessage;
        String rearrangedMessage;
        
        //recursive method to reverse words in string
        System.out.println("Part 1, recursive method");
        reversedMessage = getReverse(scan);
        System.out.println(reversedMessage);
        
        //iterative method to reverse words in string
        System.out.println("Part 2, iterative method");
        rearrangedMessage = getRearrange(scan);
        System.out.println(rearrangedMessage);
    } //end main 

    private static String getReverse(Scanner scan) {
        String nextWord;
        //code goes here
        return x;
    } //end method getReverse

    private static String getRearrange(Scanner scan) {
        //code goes here
        return y;
    } // end method getRearrange
} //end class PrintReverseMessageRecursive
