import org.apache.commons.lang3.StringUtils;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        //Prompt the user for String input

        String userInput;

        System.out.println("Enter Something: ");
        userInput = scan.next();
        System.out.println("You entered: " + userInput);

//      Tells whether or not what the user entered is a number
        if (StringUtils.isNumeric(userInput)) {
            System.out.println(userInput + " is a number");
        } else {
            System.out.println("\"" + userInput + "\" is not a number");
        }

//      Flips the case of the string
        String swapCase = StringUtils.swapCase(userInput);
        System.out.println("Flipped Case: " + swapCase);

//      Reverses the string
        String reverseString = StringUtils.reverse(userInput);
        System.out.println("Reversed: " + reverseString);

//        Enter Something: Life, The Universe, and Everything
//        You Entered: "Life, The Universe, and Everything"
//        "Life, The Universe, and Everything" is not a number
//        Flipped Case: lIFE, tHE uNIVERSE, AND eVERYTHING
//        Reversed: gnihtyrevE dna ,esrevinU eht ,efiL


    } // End of Main

} // End of Exercise Class

