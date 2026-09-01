package methods;

import java.util.Scanner;
/*1. write a mothod to return maximum and number and another method 
for minimum of an array
 2. Input 2 arrays and merge them using methods
    a = {5,8,9,6}
    b = {1,2,1,2}
    c = {6,10,10,8}
    input method
    print method
    merge method
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8,9,45,5,9,454,78};
        Scanner sc = new Scanner(System.in);
        System.out.println("Before Sorting");
        printArray(arr);
        sort(arr);
        System.out.println("After Sorting");
        printArray(arr);

        int[] a1 = {5,6,2,4};
        sort(a1);
        printArray(a1);

        int N = sc.nextInt();
        int b[] = new int[N];
        inputArray(b);
        sort(b);
        printArray(b);

    }
    public static void sort(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
    }
    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void inputArray(int[] a){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }
}
