/*Write a program to find biggest number among twos
a , b
*/
package if_demo;

import java.util.Scanner;

public class BiggerTwoNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("A is Big");
        } else if(b>a){
            System.out.println("B is Big");
        } else {
            System.out.println("Both are equal");
        }
    }
}
