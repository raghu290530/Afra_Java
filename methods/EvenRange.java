package methods;

import java.util.Scanner;

public class EvenRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter of 1st num");
        int n1=sc.nextInt();
        System.out.println("enter 2nd number");
        int n2=sc.nextInt();
        evenRanvge(n1, n2);
        System.out.println(isEven(20));
    }
    public static boolean isEven(int n){
        return n%2 == 0;
    }
    public static void evenRanvge(int n1,int n2){
        for(int i=n1;i<=n2;i++){
            if (isEven(i))
                System.out.print(i+ " ");
        }
    }
}
