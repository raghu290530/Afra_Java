package arrays;

import java.util.Scanner;

/*W.A.P to declare, initialize and printing of an array. 
by input*/
public class ArrayDeclare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int n = sc.nextInt();
        //Array Declaration
        int[] a = new int[n];
        //Input array
        System.out.print("Enter "+n+" Elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        //array print
        System.out.print("Array Elemets: ");
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
    }
}
