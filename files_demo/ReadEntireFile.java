package files_demo;
import java.util.*;
import java.io.*;

public class ReadEntireFile {
    public static void main(String[] args) {
        File f = new File("files_demo\\test.txt");
        try(Scanner sc = new Scanner(f)){
            String data;
            while (sc.hasNextLine()) {
                data = sc.nextLine();
                System.out.println(data);
            }
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}
