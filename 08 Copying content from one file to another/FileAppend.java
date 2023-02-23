import java.util.*;
import java.io.*;
import java.lang.*;

public class FileAppend {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        FileInputStream readFile;
        FileOutputStream writeFile;

        String tempOne = "", tempTwo = "";

        System.out.println("Enter the name of the file to read [excluding extension]: ");
        String fileToRead = scan.nextLine();

        System.out.println("Enter the name of the file to append [excluding extension]: ");
        String fileToAppend = scan.nextLine();

        scan.close();

        try {
            readFile = new FileInputStream(fileToRead);
            writeFile = new FileOutputStream(fileToAppend, true);

            int c;
            do {
                c = readFile.read();
                if (c != -1) {
                    writeFile.write((char) c);
                }
            } while (c != -1);
        } catch (Exception e) {
        }

    }
}