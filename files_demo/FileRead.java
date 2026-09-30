package files_demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) {
        File f = new File("files_demo\\test.txt");
        try(Scanner sc = new Scanner(f)){
            String data = sc.nextLine();
            System.out.println(data);
            data = sc.nextLine();
            System.out.println(data);
            data = sc.nextLine();
            System.out.println(data);
            // data = sc.nextLine();
            // System.out.println(data); error
        }catch(IOException e){
            System.out.println("File doesnot exist");
        }
    }
}
