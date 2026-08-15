package loops;

import java.util.Scanner;
/*Sum of digits, count of digits, reverse, palindrome(121 reverse-> 121), amstrong() */
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int t = n; Template
        // while (t!=0) {
        //     int r = t%10;
        //     t = t/10;
        // }
        int t = n; // 658
        int count = 0;
        int sum = 0;
        int rev = 0;
        while (t!=0) {
            int r = t%10; // 6
            count++;
            sum = sum + r;
            rev = rev*10 + r; // 856
            t = t/10; // 0
        }
        System.out.println("No of digits = "+count);
        System.out.println("Sum = "+ sum);
        System.out.println("Revese = "+rev);
        if(rev == n){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not Palinrome");
        }
    }
}
