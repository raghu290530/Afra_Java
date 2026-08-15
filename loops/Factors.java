package loops;

import java.util.Scanner;

/*•	W.A.P to print all the factors of given no.  
 6 -> 1 2 3 6
 50 -> 1 2 5 10 25 50
 18 -> 1 2 3 6 9 18
 9 -> 1 3 9
*/
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int count = 0;
        while (i<=n) {
            if (n%i == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
