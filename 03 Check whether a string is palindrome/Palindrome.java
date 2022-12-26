import java.util.*;

class Palindrome {
    public static void main(String[] args) {

        // Initializing variables
        String text, textCopy = "";

        Scanner scan = new Scanner(System.in);

        // Getting string from user
        System.out.print("Enter String : ");
        text = scan.nextLine();

        // Closing scanner
        scan.close();

        // Copying string in reverse order
        for (int i = text.length() - 1; i >= 0; i--) {
            textCopy += text.charAt(i);
        }

        // Checking for palindrome
        if (text.equals(textCopy)) {
            System.out.println("\nThe given string " + text + " is palindrome.");
        } else {
            System.out.println("\nThe given string " + text + " is not a palindrome.");
        }
    }
}