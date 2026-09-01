package loops;

import java.util.Scanner;

public class PrimeOpt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        //100 -> 2 4 5 10 25 50 100
        //28 -> 2 4 7 14 28
        //6 -> 2 3 6
        //9/2 -> 3 9
        //8/2 ->4
        for(int i=2;i<n/2+1;i++){
            if(n%i==0){
                count = 1;
                System.out.println("Not Prime");
                break;
            }
        }
        if (count==0) 
            System.out.println("Prime");
        }
}
