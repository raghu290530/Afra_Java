package loops;

import java.util.Scanner;

/*Findifing sum of infinite numbers 
W.A.P to count no of +ve nos and -ve nos in infite loop
take inpupt infinte times. if user enters 0 stop the loop
*/
public class FindSumofNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            int n = sc.nextInt();
            sum = sum + n;
            if (n==0)
                break;
        }
        System.out.println("Sum = " + sum);
    }
}
