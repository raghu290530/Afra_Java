package basics;

import java.util.Scanner;

/*Name,age
I am Raghu and i am 30 years old.
*/
public class FormattedString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        double sal = 20000.6598;
        System.out.println("I am "+name+" and i am "+age+"years old.");
        System.out.printf("I am %s and i am %d years old. My sal is %.2f.",name,age,sal);
    }
}
