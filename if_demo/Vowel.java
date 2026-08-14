package if_demo;

import java.util.Scanner;

//W.A.P to find the given alphabet is vowel or consonant?||
public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        double d = 25.6698689;
        System.out.printf("Sum = %.4f",d);
        if (Character.isAlphabetic(ch)){
            ch = Character.toLowerCase(ch);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.println("Vowel");
            }else{
                System.out.println("Consonet");
            }
        } else{
            System.out.println("Worong Alphabet");
        }
        
    }
}
