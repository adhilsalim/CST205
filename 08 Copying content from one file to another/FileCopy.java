import java.util.*;
import java.io.*;

class FileCopy {
    public static void main(String[] args) {

        FileInputStream fin;
        FileOutputStream fout;
        Scanner scan = new Scanner(System.in);

        // Getting the name of file to read and to copy to
        System.out.println("Enter the name of the file to read from: ");
        String readFrom = scan.nextLine();

        System.out.println("Enter the name of the file to write to: ");
        String writeTo = scan.nextLine();

        // Removing the .txt extension from the file names if the user entered it
        readFrom = readFrom.replaceAll(".txt", "");
        writeTo = writeTo.replaceAll(".txt", "");

        // Closing the scanner
        scan.close();

        try {
            fin = new FileInputStream(readFrom + ".txt");
            fout = new FileOutputStream(writeTo + ".txt");

            System.out.println("Copying content from " + readFrom + ".txt to " + writeTo + ".txt");

            // Reading and Writing the content of the file
            int data = fin.read();
            while (data != -1) {
                fout.write((char) data);
                data = fin.read();
            }

            // Closing the streams
            fin.close();
            fout.close();

            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}