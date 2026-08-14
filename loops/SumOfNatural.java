package loops;

import java.util.Scanner;

/*•	W.A.P to find sum of first n natural nos? 5 => 15 */
public class SumOfNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //5
        int i = 1;
        int sum = 0;
        while (i<=n) {
            sum += i; //sum = sum + i -> 15
            i++;
        }
        System.out.println("Sum = " + sum);
    }
}
