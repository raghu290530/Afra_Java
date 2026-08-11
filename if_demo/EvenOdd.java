package if_demo;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthPasswordFieldUI;

/*Given no is even or odd */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num%2 ==0){
            System.out.println("Even");
        }
    }
}
