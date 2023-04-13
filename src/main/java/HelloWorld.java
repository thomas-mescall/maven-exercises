import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //StringUtils string = new StringUtils();

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        String userInput = myScanner.nextLine();

        if (StringUtils.isNumeric(userInput)) {
            System.out.printf("Your number is: %s", userInput);
        } else {
            System.out.printf("You Entered: %s%n", userInput);
            System.out.println(userInput + " is not a number");
            System.out.printf("Flipped Case: %s%n", StringUtils.swapCase(userInput));
            System.out.printf("Reversed: %s%n", StringUtils.reverse(userInput));
        }
    }
}
