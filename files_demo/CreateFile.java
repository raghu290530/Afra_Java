package files_demo;
import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try{
            // File f = new File("files_demo\\demo1.txt");
            // boolean r = f.createNewFile();
            FileWriter fw = new FileWriter("files_demo\\demo1.txt",true);
            fw.write("I am Raghu\n");
            fw.write("Bellary");
            fw.close();
            // System.out.println(r);
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}
