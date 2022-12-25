import java.util.*;

class Palindrome {
    public static void main(String[] args) {

        String text, textCopy = "";

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter String : ");
        text = scan.nextLine();

        scan.close();

        for (int i = text.length() - 1; i >= 0; i--) {
            textCopy += text.charAt(i);
        }

        if (text.equals(textCopy)) {
            System.out.println("\nThe given string " + text + " is palindrome.");
        } else {
            System.out.println("\nThe given string " + text + " is not a palindrome.");
        }
    }
}