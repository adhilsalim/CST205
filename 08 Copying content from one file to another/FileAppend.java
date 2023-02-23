import java.util.*;
import java.io.*;
import java.lang.*;

public class FileAppend {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        FileInputStream fin;
        FileOutputStream fout;

        String temp="";

        System.out.println("Enter the name of the file to read [excluding extension]: ");
        String fRead = scan.nextLine();

        System.out.println("Enter the name of the file to append [excluding extension]: ");
        String fAppend = scan.nextLine();

        scan.close();

        try {
            fin = new FileInputStream(fRead + ".txt");
            fout = new FileOutputStream(fAppend + ".txt");

            int c = fin.read();

          }  
        catch(Exception err){
            System.out.println(err.getMessage());
        }

    }
}