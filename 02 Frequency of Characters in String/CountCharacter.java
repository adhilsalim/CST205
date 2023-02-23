import java.util.*;

class CountCharacter {
    public static void main(String[] args) {

        // Initializing variables
        char key;
        int count = 0;
        String text = "";
        Scanner scan = new Scanner(System.in);

        // Getting string from user
        System.out.print("Enter String: ");
        text = scan.nextLine();

        // Getting character to be searched
        System.out.print("Enter character to search: ");
        key = scan.next().charAt(0);

        // Closing scanner
        scan.close();

        // Searching for element
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == key) {
                count++;
            }
        }

        // validation
        if (count != 0) {
            System.out.print(
                    "\nThe element '" + key + "' was found repeating " + count + " times in '" + text + "' .");
        } else {
            System.out.print("\nThe element '" + key + "' was not found in '" + text + "' .");
        }
    }

}