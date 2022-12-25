import java.util.*;

class SumFromString {
    public static void main(String[] args) {

        int sum = 0;

        Scanner scan = new Scanner(System.in);

        // Getting the string of integers
        System.out.println("Enter string of integers in the format x+y+z....");
        String integerString = scan.next();

        // Closing the scanner
        scan.close();

        try {
            StringTokenizer st = new StringTokenizer(integerString, "+");

            // Adding the integers
            while (st.hasMoreTokens()) {
                String slice = st.nextToken();
                System.out.println("Slice: " + slice);
                sum += Integer.parseInt(slice);
            }

            // Printing the sum
            System.out.println("Sum of " + integerString + " is " + sum);
        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage()
                    + "\nEither the string is of invalid format or the string contains non-integer characters.");
        }
    }
}