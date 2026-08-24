package arrays;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int a[]=new int [n];
        System.out.println("enter the array elements");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        //Selection sort
        for (int i = 0; i < a.length-1; i++) {
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        System.out.print("Array after sorting: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
}
