package files_demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MaxFileNo {
    public static void main(String[] args) {
        File f = new File("files_demo\\numbers.txt");
        int[] arr = new int[1000];
        try(Scanner sc = new Scanner(f)){
            int data;
            int i=0;
            while (sc.hasNext()) {
                arr[i] = sc.nextInt();
                i++;
            }
            System.out.println("Max = " + max(arr));
        }catch(IOException e){
            System.out.println("File not found");
        }
    }

    public static int max(int[] a){
        int m = a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>m){
                m=a[i];
            }
        }
        return m;
    }
}
