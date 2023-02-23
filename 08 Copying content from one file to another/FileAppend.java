import java.util.*;
import java.io.*;
import java.lang.*;

public class FileAppend {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        FileInputStream fin;
        FileOutputStream fout;

        System.out.println("Enter the name of the file to read [excluding extension]: ");
        String fRead = scan.nextLine();
 
        //skipping new line
        scan.nextLine();

            fin = new FileInputStream(fRead + ".txt");
            fout = new FileOutputStream(fAppend + ".txt");
        }catch(Exception err){}

    }
}