package loops;
/*•	W.A.P to print all even numbers between two given numbers(range) ? */
import java.util.Scanner;

public class EvenRagnge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt(); //20
        int n2 = sc.nextInt();//10
        if (n1>n2){
            int t = n1; // 20
            n1 = n2; // 10
            n2 = t;// 20
        }
        int i = n1;
        while (i<=n2) {
            if (i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }

    }
}
