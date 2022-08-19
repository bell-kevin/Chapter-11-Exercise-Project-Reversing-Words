package reverseSentenceButNotReverseWords;
import java.util.Scanner;

public class reverseSentenceButNotReverseWords {
    public static void main(String[] args) {
        System.out.println("Ch 11 Strings by Kevin Bell \n");
        String message = new String("We Are Many");
        Scanner scan = new Scanner(message);
        String reversedMessage;
        String rearrangedMessage;
        
        //recursive method to reverse words in string
        System.out.println("Part 1, recursive method");
        reversedMessage = getReverse(scan);
        System.out.println(reversedMessage);
        
        //iterative method to reverse words in string
        rearrangedMessage = getRearrange(scan);
        
        
        
    } // end main method
    
     private static String getReverse(Scanner scan) {
        String nextWord;
        //code goes here
        
        
        
        return null;
    } //end method getReverse

    private static String getRearrange(Scanner scan) {
        //code goes here
        String sentence;
        sentence = "We Are Many";
        String[] splitSentence = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder(); // using a StringBuilder for performance improvements
        for (int i = splitSentence.length - 1; i >= 0; i--) { // append to StringBuilder in reverse order.
            reversedSentence.append(splitSentence[i]).append(" ");
        } // end for loop
        System.out.println("Part 2, iterative processing");
        System.out.println(reversedSentence.toString());
        return reversedSentence.toString();
    } // end method getRearrange
} // end reverseSentenceButNotReverseWords class
